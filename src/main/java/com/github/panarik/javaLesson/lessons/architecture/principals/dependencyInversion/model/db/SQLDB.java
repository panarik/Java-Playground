package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db;

public class SQLDB implements DataBaseProvider {

    public void update(String text) {
        System.out.println(String.format("SQL: %s", text));
    }

}
