package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESEngine;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESUFOEngine;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESUFOGun;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESWeapon;

/**
 * This factory creates very specific UFO Enemy Ship.
 * This is where we define all the parts the ship will use by defining the methods implemented being ESWeapon and ESEngine.
 * The returned object specifies a specific weapon & engine.
 */
public class UFOEnemyShipFactory implements EnemyShipFactory {

    // Defines the weapon object to associate with the ship
    public ESWeapon addESGun() {
        return new ESUFOGun(); // Specific to regular UFO
    }

    // Defines the engine object to associate with the ship
    public ESEngine addESEngine() {
        return new ESUFOEngine(); // Specific to regular UFO
    }

}
