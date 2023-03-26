package com.github.panarik.javaLesson.lessons.architecture.principals.dependencyInversion.model.db;

public class OracleDB implements DataBaseProvider {

    public void update(String text) {
        System.out.println(String.format("ORACLE: %s", text));
    }

}
