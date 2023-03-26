package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factory.data;

public class Car extends Vehicle {

    @Override
    public void run() {
        System.out.println("Car runs at 100km/h.");
    }
}
