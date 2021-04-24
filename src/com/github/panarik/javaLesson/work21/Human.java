package com.github.panarik.javaLesson.work21;

public class Human implements Jumping,Running {
    @Override
    public void jump() {
        System.out.println("Человек прыгает");
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    public void jumpOverWall(int heightSM) {
        System.out.print("Человек ");
        Wall.jumpOverWall(heightSM);
    }
}
