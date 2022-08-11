package com.github.panarik.javaLesson.lessons.patterns.creational.singleton;

public class SingletonPatternExample {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.field);
        System.out.println(singleton1.field);
    }

}
