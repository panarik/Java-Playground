package com.github.panarik.javaLesson.work21;

public class Robot implements Running, Jumping {
    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }

    @Override
    public void run() {
        System.out.println("Робот бежит ");
    }

    void jumpOverWall(int heightSM){
        System.out.print("Робот ");
        Wall.jumpOverWall(heightSM);
    }
}
