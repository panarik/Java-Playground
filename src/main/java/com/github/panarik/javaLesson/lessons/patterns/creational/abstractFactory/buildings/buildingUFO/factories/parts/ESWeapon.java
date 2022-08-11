package com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts;

// Any part that implements the interface ESWeapon
// can replace that part in any ship

public interface ESWeapon{

    // User is forced to implement this method
    // It outputs the string returned when the
    // object is printed
    String toString();

}
