package com.github.panarik.javaLesson.work21;

public class Human implements Jumping,Running {

    private int maxDistanceKilometers = 50;
    private int maxJumpSM = 200;

    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public void run(int distanceKiloMeters) {
        System.out.println("Человек бежит");
    }

    public void jumpOverWall(int heightSM) {
        if (heightSM<maxJumpSM) {
            System.out.print("Человек ");
            Wall.jumpOverWall(heightSM);
        }
        else System.out.printf("Человек не смог перепрыгнуть через препятствие высотой %d см.\n", heightSM);

    }

    void runOnTable(int distanceKiloMeters) {
        if (distanceKiloMeters<maxDistanceKilometers) {
            System.out.print("Человек ");
            RunTable.runOnTable(distanceKiloMeters);
        }
        else System.out.printf("Человек не смог пробежать на дистанцию %d километров.\n", distanceKiloMeters);

    }


}
