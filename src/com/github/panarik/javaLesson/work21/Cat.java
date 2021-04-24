package com.github.panarik.javaLesson.work21;

public class Cat implements Running, Jumping {
    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    void jumpOverWall(int heightSM){
        System.out.print("Кот ");
        Wall.jumpOverWall(heightSM);
    }
}
