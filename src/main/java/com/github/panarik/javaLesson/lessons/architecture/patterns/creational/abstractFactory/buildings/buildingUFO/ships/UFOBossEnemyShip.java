package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.ships;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.EnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip {

    /**
     * The enemy ship required parts list is sent to this method.
     * They state that the enemy ship must have a weapon and engine assigned.
     * That object also states the specific parts needed to make a Boss UFO versus a Regular UFO
     *
     * @param shipFactory Assigned {@link EnemyShipFactory} which knows than kind of specific parts needed.
     */
    public UFOBossEnemyShip(EnemyShipFactory shipFactory) {
        System.out.println("Making enemy ship.");

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOBossEnemyShip here
        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }

}
