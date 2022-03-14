package com.github.panarik.javaLesson.lessons.lang.collections.model;



public class Box implements Comparable<Box> {

    int value;

    public Box(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }

    @Override
    public int compareTo(Box o) {
        return this.value - o.value;
    }

}
