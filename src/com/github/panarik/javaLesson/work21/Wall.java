package com.github.panarik.javaLesson.work21;

public class Wall implements Jumping {
    private int heightSM;

    public Wall(int heightSM){
        this.heightSM = heightSM;
    }

    @Override
    public void jump() {
        System.out.println("прыгает через стену");
    }

    public static void jumpOverWall(int heightSM){
        System.out.printf("прыгает на высоту %s см.\n", heightSM);
    }

}
