package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.ships;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {

    // The enemy ship required parts list is sent to this method.
    // They state that the enemy ship must have a weapon and engine assigned.
    // That object also states the specific parts needed to make a regular UFO versus a Boss UFO
    public UFOEnemyShip(EnemyShipFactory shipFactory) {
        System.out.println("Making enemy ship.");

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOEnemyShip here
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

}
