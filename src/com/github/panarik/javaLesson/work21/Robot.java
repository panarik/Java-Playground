package com.github.panarik.javaLesson.work21;

public class Robot implements Running, Jumping {

    private int maxDistanceKilometers = 200;
    private int maxJumpSM = 300;

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public void run(int distanceKiloMeters) {
        System.out.println("Робот бежит ");
    }

    void jumpOverWall(int heightSM) {
        if (heightSM<maxJumpSM) {
            System.out.print("Робот ");
            Wall.jumpOverWall(heightSM);
        }
        else System.out.printf("Робот не смог перепрыгнуть через препятствие высотой %d см.\n", heightSM);

    }

    void runOnTable(int distanceKiloMeters) {
        if (distanceKiloMeters<maxDistanceKilometers) {
            System.out.print("Робот ");
            RunTable.runOnTable(distanceKiloMeters);
        }
        else System.out.printf("Робот не смог пробежать на дистанцию %d километров.\n", distanceKiloMeters);

    }
}
