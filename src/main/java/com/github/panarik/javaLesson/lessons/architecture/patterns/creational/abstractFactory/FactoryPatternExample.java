package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.EnemyShipBuilding;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.UFOEnemyShipBuilding;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.ships.EnemyShip;

public class FactoryPatternExample {

    public static void main(String[] args) {

        // EnemyShipBuilding handles orders for new UFO based EnemyShips.
        EnemyShipBuilding building = new UFOEnemyShipBuilding();

        // Sends the order to the UFO factory for creation.
        EnemyShip theGrunt = building.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        // Sends the order to the UFO BOSS factory for creation.
        EnemyShip theBoss = building.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");
    }

}
