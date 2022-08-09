package com.github.panarik.javaLesson.lessons.lang.oop.polymorphism.interfaces;

public interface Flyable { //также можно наследоваться от других интерфейсов

    //могут быть только константы
    String SOME_STRING = "some string";

    void fly();

    //начиная с Java 8
    default void land() {
        System.out.println("Приземляется");
    }

    //Начиная с Java 9
    static void doStatic() {
        System.out.println("STATIC");
    }

}
