package com.github.panarik.javaLesson.lang.reflection.hiber;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class LittleHiber {
    private static Connection connection;
    private static Statement smt;
    private static PreparedStatement psmt;

    private static void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:reflect.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable(Class c) {
        //мапим поля к именам в базе
        Map<Class, String> typeMap = new HashMap<>();
        typeMap.put(int.class, "integer");
        typeMap.put(String.class, "text");

        if (!c.isAnnotationPresent(Table.class)) throw new RuntimeException("Unable to create table");
        try {
            connect();
            smt = connection.createStatement();
            StringBuilder builder = new StringBuilder("create table if not exists ");
            builder.append(((Table) c.getAnnotation(Table.class)).name());
            builder.append("(");
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                if (f.isAnnotationPresent(HField.class)) {
                    builder.append(f.getName());
                    builder.append(" ");
                    builder.append(typeMap.get(f.getType()));
                    builder.append(", ");
                }
            }
            builder.setLength(builder.length() - 2);
            builder.append(");");
            smt.execute(builder.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public static void insert(Object o) {
        if (!o.getClass().isAnnotationPresent(Table.class)) throw new RuntimeException("Unable to create table");
        try {
            // insert into cats(id, mane, color) values(?,?,?);
            connect();
            StringBuilder builder = new StringBuilder("insert into ");
            builder.append((o.getClass().getAnnotation(Table.class)).name());
            builder.append(" (");
            Field[] fields = o.getClass().getDeclaredFields();
            int sum = 0;
            for (Field f : fields) {
                if (f.isAnnotationPresent(HField.class)) {
                    builder.append(f.getName());
                    builder.append(", ");
                    sum++;
                }
            }
            builder.setLength(builder.length() - 2);
            builder.append(") values (");
            for (int i = 0; i < sum; i++) {
                builder.append(i + 1 == sum ? "?);" : "?, ");
            }
            psmt = connection.prepareStatement(builder.toString());
            
            int num = 1;
            for (Field field : fields) {
                if (field.isAnnotationPresent(HField.class)) {
                    field.setAccessible(true);
                    psmt.setObject(num++, field.get(o));
                }
            }
            psmt.executeUpdate();
        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private static void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
