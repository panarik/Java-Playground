package com.github.panarik.javaLesson.work21;

public class Cat implements Running, Jumping {

    private int maxDistanceKilometers = 2;
    private int maxJumpSM = 50;

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void run(int distanceKiloMeters) {
        System.out.println("Кот бежит");
    }

    void jumpOverWall(int heightSM){
        if (heightSM<maxJumpSM) {
            System.out.print("Кот ");
            Wall.jumpOverWall(heightSM);
        }
        else {
            System.out.printf("Кот не смог прыгнуть на высоту %d см.\n", heightSM);
        }

    }

    void runOnTable(int distanceKiloMeters) {
        if (distanceKiloMeters<maxDistanceKilometers) {
            System.out.print("Кот ");
            RunTable.runOnTable(distanceKiloMeters);
        }
        else System.out.printf("Кот не смог пробежать на дистанцию %d километров.\n", distanceKiloMeters);

    }
}
