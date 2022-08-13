package com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies;

/**
 * Target interface. It's needed for creating enemies.
 */
public interface EnemyAttacker {

    void fireWeapon();

    void driveForward();

    void assignDriver(String driverName);

}
