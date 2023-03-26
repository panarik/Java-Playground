package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factory;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.factory.data.Vehicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
 */
public class FactoryPatternExample {

    public static void main(String[] args) {

        // Create factory for produce different types of vehicles.
        Factory factory = new Factory();

        // This factory produces 'Car', 'Truck', 'Bike' to the one conveyor belt.
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(factory.createVehicle("Car")); // produce car.
        vehicles.add(factory.createVehicle("Truck"));  // produce truck.
        vehicles.add(factory.createVehicle("Bike")); // produce bike.

        // All produces vehicles can be used from one group.
        for (Vehicle vehicle : vehicles) {
            vehicle.run();
        }
    }

}
