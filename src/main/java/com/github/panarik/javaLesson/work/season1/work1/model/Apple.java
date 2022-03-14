package com.github.panarik.javaLesson.work.season1.work1.model;

public class Apple extends Fruit {
    private String name = "Apple";

    public Apple(float weight) {
        super(weight);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "fruit='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
