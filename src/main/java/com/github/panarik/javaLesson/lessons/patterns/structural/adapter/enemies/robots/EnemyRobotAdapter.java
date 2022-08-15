package com.github.panarik.javaLesson.lessons.patterns.structural.adapter.enemies.robots;

import com.github.panarik.javaLesson.lessons.patterns.structural.adapter.enemies.EnemyAttacker;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    public void fireWeapon() {
        robot.smashWithHands();
    }

    public void driveForward() {
        robot.walkForward();
    }

    public void assignDriver(String driverName) {
        System.out.println("Enemy robot avoid driver " + driverName + ".");
    }

}
