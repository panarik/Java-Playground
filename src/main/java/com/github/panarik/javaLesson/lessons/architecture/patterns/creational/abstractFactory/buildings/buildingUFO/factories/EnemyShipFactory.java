package com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories;

import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESEngine;
import com.github.panarik.javaLesson.lessons.architecture.patterns.creational.abstractFactory.buildings.buildingUFO.factories.parts.ESWeapon;

/**
 * This interface define the abstract factory which makes UFO based ships.
 * With an Abstract Factory Pattern you won't just build ships, but also all the components for the ships.
 * Here is where you define the parts that are required if an object wants to be an enemy ship.
 */
public interface EnemyShipFactory {

    ESWeapon addESGun();

    ESEngine addESEngine();

}
