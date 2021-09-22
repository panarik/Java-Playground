package com.github.panarik.javaLesson.season3.work1.model;

public class Apple extends Fruit {
    private String name = "Яблоко";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                '}';
    }
}
