package com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies;

import java.util.Random;

/**
 * Defines concrete tank based on {@link EnemyAttacker}.
 */
public class EnemyTank implements EnemyAttacker {

    Random random = new Random();

    public void fireWeapon() {
        int damage = random.nextInt(10) + 1;
        System.out.println("Enemy tank cannon does " + damage + " damage.");
    }

    public void driveForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("Enemy tank moves forward " + movement + " spaces.");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank.");
    }

}
