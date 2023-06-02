package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.singleton;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.singleton.singletonFinal.SingletonFinal;

public class SingletonPatternExample {

    public static void main(String[] args) {

        // First singleton.
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.field);
        System.out.println(singleton1.field);

        // Final singleton.
        SingletonFinal final1 = SingletonFinal.getInstance();
        SingletonFinal final2 = SingletonFinal.getInstance();
        final1.setData("singleton data 1");
        final2.setData("singleton data 2");
        System.out.println(final1.getData());
    }

}
