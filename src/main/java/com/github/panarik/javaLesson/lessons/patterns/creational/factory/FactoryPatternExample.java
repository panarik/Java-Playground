package com.github.panarik.javaLesson.lessons.patterns.creational.factory;

import com.github.panarik.javaLesson.lessons.patterns.creational.factory.data.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class FactoryPatternExample {

    public static void main(String[] args) {

        Factory factory = new Factory();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(factory.createVehicle("Car"));
        vehicles.add(factory.createVehicle("Truck"));
        vehicles.add(factory.createVehicle("Bike"));

        for(Vehicle vehicle : vehicles) {
            vehicle.run();
        }



    }

}
