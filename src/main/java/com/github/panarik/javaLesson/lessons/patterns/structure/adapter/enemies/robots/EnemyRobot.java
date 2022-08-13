package com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies.robots;

import com.github.panarik.javaLesson.lessons.patterns.structure.adapter.enemies.EnemyAttacker;

import java.util.Random;

/**
 * This class represented some type of {@link EnemyAttacker} with unique methods.
 */
public class EnemyRobot {

    Random random = new Random();

    void smashWithHands() {
        int damage = random.nextInt(5) + 1;
        System.out.println("Enemy robot hands does " + damage + " damage.");
    }

    void walkForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("Enemy robot walks forward " + movement + " spaces.");
    }

    void jumps() {
        System.out.println("Enemy robot jumps.");
    }

}
