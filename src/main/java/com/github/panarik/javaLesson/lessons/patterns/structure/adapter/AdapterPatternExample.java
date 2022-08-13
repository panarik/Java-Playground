package com.github.panarik.javaLesson.lessons.patterns.structure.adapter;

import com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies.EnemyAttacker;
import com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies.EnemyTank;
import com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies.robots.EnemyRobot;
import com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies.robots.EnemyRobotAdapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterPatternExample {

    public static void main(String[] args) {

        // Create tank.
        EnemyAttacker tank = new EnemyTank();

        // Create robot.
        EnemyRobot robot = new EnemyRobot();

        // Create adapter for robot.
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);

        // Use both objects with one interface.
        List<EnemyAttacker> attackers = new ArrayList<>();
        attackers.add(tank);
        attackers.add(robotAdapter);
        for (EnemyAttacker attacker : attackers) {
            attacker.assignDriver("Sam");
            attacker.driveForward();
            attacker.fireWeapon();
        }

    }

}
