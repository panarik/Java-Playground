package com.github.panarik.javaLesson.lessons.lang.reflection.example.obj;

import java.io.Serializable;

public class Cat implements Cloneable, Serializable {

    static String type = "CAT";
    public final String name;
    public String color;

    @MyAnnotation(value = "Hello")
    int age;
    private Bowl b;

    public Cat() {
        this.name = "nameless";
        this.age = 0;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    private void run(int distance) {
        System.out.println(this.name + " running for " + distance);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

}
