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

    void jumpOverObjectWall (Wall wall){
        if (wall.getHeightSM()<maxJumpSM) System.out.printf("Кот прыгает через объектную стену высотой %d см.\n", wall.getHeightSM());
        else System.out.printf("Кот не смог прыгнуть на высоту %d см.\n", wall.getHeightSM());
    }

    void runOnTable(int distanceKiloMeters) {
        if (distanceKiloMeters<maxDistanceKilometers) {
            System.out.print("Кот ");
            RunTable.runOnTable(distanceKiloMeters);
        }
        else System.out.printf("Кот не смог пробежать на дистанцию %d километров.\n", distanceKiloMeters);
    }

    void runOnObjectTable(RunTable runTable) {
        if (runTable.getDistance()<maxDistanceKilometers) System.out.printf("Кто пробегает %d километров.\n", runTable.getDistance());
        else System.out.printf("Кот не смог пробежать на дистанцию %d километров.\n", runTable.getDistance());
    }
}
