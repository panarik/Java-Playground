package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.singleton;

public class Singleton {

    public final String field = "Here is singleton field!";
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

}
