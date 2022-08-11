package com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings;

import com.github.panarik.javaLesson.lessons.patterns.creational.abstractFactory.buildings.buildingUFO.ships.EnemyShip;

/**
 * This abstract class provides an ordering mechanism for creating any EnemyShip.
 */
public abstract class EnemyShipBuilding {

    /**
     * When called a new EnemyShip is made. The specific parts are based on the String entered.
     * After the ship is made we execute multiple methods in the EnemyShip Object.
     */
    public EnemyShip orderTheShip(String typeOfShip) {

        // Call abstract factory method because here we don't know how this ordered EnemyShip should look like.
        EnemyShip theEnemyShip = makeEnemyShip(typeOfShip);

        // Here we know how we can deliver this abstract EnemyShip.
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;

    }

    /**
     * The specific parts used for engine & weapon depend upon the String that is passed to this method.
     *
     * @param typeOfShip Types of ship.
     * @return {@link EnemyShip}
     */
    protected abstract EnemyShip makeEnemyShip(String typeOfShip);

}
