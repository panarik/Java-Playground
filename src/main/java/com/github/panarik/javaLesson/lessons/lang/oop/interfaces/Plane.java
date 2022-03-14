package com.github.panarik.javaLesson.lessons.lang.oop.interfaces;

public class Plane implements Flyable {

    String modelName;

    Plane(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void fly() {
        System.out.printf("%s самолет летит\n", modelName);
    }
}
