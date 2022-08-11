package com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings.buildingUFO.factories;

import com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESEngine;
import com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESUFOBossEngine;
import com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESUFOBossGun;
import com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESWeapon;

/**
 * This factory creates very specific UFO Enemy Ship.
 * This is where we define all the parts the ship will use by defining the methods implemented being ESWeapon and ESEngine.
 * The returned object specifies a specific weapon & engine
 */
public class UFOBossEnemyShipFactory implements EnemyShipFactory {

    // Defines the weapon object to associate with the ship
    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFO
    }

    // Defines the engine object to associate with the ship
    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFO
    }

}
