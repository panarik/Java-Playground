package com.github.panarik.javaLesson.lang.reflection.hiber;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LittleHiber {
    private Connection connection;

    private void connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:reflect.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createTable(Class c) {
        if (!c.isAnnotationPresent(Table.class)) {
            throw new RuntimeException("Unable to create table");
        }
        Statement smt = null;
        //ToDo
    }

    private void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
