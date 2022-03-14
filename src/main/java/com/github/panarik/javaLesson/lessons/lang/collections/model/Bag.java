package com.github.panarik.javaLesson.lessons.lang.collections.model;

public class Bag {

    private int value;

    public Bag(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "value=" + value +
                '}';
    }
}
