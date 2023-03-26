package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.EnemyShipFactory;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.UFOBossEnemyShipFactory;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.UFOEnemyShipFactory;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.ships.UFOBossEnemyShip;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.ships.UFOEnemyShip;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.EnemyShipBuilding;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.ships.EnemyShip;

/**
 * This is the only class that needs to change,
 * if you want to determine which enemy ships you want to provide as an option to build.
 */
public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    protected EnemyShip makeEnemyShip(String typeOfShip) {
        switch (typeOfShip) {

            // If UFO was sent grab use the factory that knows what types of weapons and engines a regular UFO needs.
            // The EnemyShip object is returned & given a name
            case ("UFO") -> {
                EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
                EnemyShip enemyShip = new UFOEnemyShip(shipPartsFactory);
                enemyShip.setName("UFO Grunt Ship");
                return enemyShip;
            }

            // If UFO BOSS was sent grab use the factory that knows what types of weapons and engines a Boss UFO needs.
            // The EnemyShip object is returned & given a name.
            case ("UFO BOSS") -> {
                EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
                EnemyShip enemyShip = new UFOBossEnemyShip(shipPartsFactory);
                enemyShip.setName("UFO Boss Ship");
                return enemyShip;
            }

            default -> throw new RuntimeException("Unsupported type of ship.");

        }

    }
}
