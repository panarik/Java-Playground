package com.github.panarik.javaLesson.season3.work1.model;

public class Orange extends Fruit {
    private String name = "Orange";

    public Orange(float weight) {
        super(weight);
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Orange{" +
                "fruit='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
