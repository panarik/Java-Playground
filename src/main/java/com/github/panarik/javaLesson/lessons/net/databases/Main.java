package com.github.panarik.javaLesson.lessons.net.databases;

import java.sql.*;

public class Main {

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement ps;
    private static String insert = "insert into students (name, score) values (?, ?);";

    public static void main(String[] args) {

        try {
            connect();
            createTable();
//            insert();
//            dropTable();
//            delete();
//            update();
//            insertExample("Kolya", 50); //простой запрос
//            prepareStatementInsert("Masha", 40); //предкомпилированный запрос
//            massCommitIntoDB();
            massAutoCommitIntoDB();

//            read();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            disconnect();
        }
    }

    private static void massAutoCommitIntoDB() throws SQLException {
        //создаем строки в цикле
        long start = System.currentTimeMillis();
        connection.setAutoCommit(false);
        for (int i = 0; i<1000; i++) {
            prepareStatementInsert("Student#"+i, i);
        }
        connection.setAutoCommit(true);
        float result = (System.currentTimeMillis()) - start;
        System.out.println("Time for adding into tables: "+result * 0.001+"sec");
    }

    private static void massCommitIntoDB() throws SQLException {
        //создаем строки в цикле
        long start = System.currentTimeMillis();
        for (int i = 0; i<1000; i++) {
            prepareStatementInsert("Student#"+i, i);
        }
        float result = (System.currentTimeMillis()) - start;
        System.out.println("Time for adding into tables: "+result * 0.001+"sec");
    }

    private static void prepareStatementInsert(String name, int score) throws SQLException {
        ps.setString(1,name);
        ps.setInt(2, score);
        ps.executeUpdate();
    }

    private static void  insertExample(String name, int score) throws SQLException {
        statement.executeUpdate("insert into students (name, score) values('" + name + "', " + score + ");");
    }

    private static void read() throws SQLException {
        try (ResultSet rs = statement.executeQuery("select name, score from students")) {
            while (rs.next()) {
                System.out.printf("Students name: %s, score: %d\n", rs.getString(1), rs.getInt("score"));
            }
        }
    }

    private static void update() throws SQLException {
        statement.executeUpdate("update students set name ='Boris' where id=2;");
    }

    private static void delete() throws SQLException {
        statement.executeUpdate("delete from students where id=1;");
    }

    private static void insert() throws SQLException {
        statement.executeUpdate("insert into students (name, score) values('Vasia', 80);");
    }

    private static void dropTable() throws SQLException {
        statement.execute("drop table if exists students;");
    }

    private static void createTable() throws SQLException {
        statement.execute("create table if not exists students (id integer primary key autoincrement, name text, score integer);");
        //создаем подготовленный запрос с заранее прописанным значением
        ps = connection.prepareStatement(insert);
    }

    private static void connect() throws SQLException {
        //подключаемся или создаем БД
        connection = DriverManager.getConnection("jdbc:sqlite:src/main/resources/lesson.db");
        //создаем запрос
        statement = connection.createStatement();
    }

    private static void disconnect() {
        try {
            if (connection != null) connection.close();
            if (statement != null) statement.close();
            if (ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
