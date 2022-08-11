package com.github.panarik.javaLesson.lessons.patterns.creational.factory;

import com.github.panarik.javaLesson.lessons.patterns.creational.factory.data.Plane;
import com.github.panarik.javaLesson.lessons.patterns.creational.factory.data.Car;
import com.github.panarik.javaLesson.lessons.patterns.creational.factory.data.Truck;
import com.github.panarik.javaLesson.lessons.patterns.creational.factory.data.Vehicle;

public class Factory {

    public Vehicle createVehicle(String type) {
        switch (type) {
            case ("Car") -> {
                return new Car();
            }
            case ("Truck") -> {
                return new Truck();
            }
            case ("Bike") -> {
                return new Plane();
            }
            default -> throw new RuntimeException("Wrong input.");
        }
    }

}
