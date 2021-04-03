package com.github.panarik.javaLesson.work6.animals;

import com.github.panarik.javaLesson.work6.items.Bowl;

public abstract class Animal {

    protected String name; //имя животного
    protected int appetite; //аппетит животного

    //животное может бежать
    public void run(int distanceRun, int distanceSwim) {
        System.out.println(name+" пробежал "+distanceRun+" метров и проплыл "+distanceSwim+" метров.");
    }

    //животное может есть из миски
    public void eatFromBowl(Bowl bowl) {
        bowl.decreaseFood(appetite);
        System.out.printf("%s съел из миски %d еды. В миске осталось %d еды",this.name, appetite, bowl.getFoodAmount());
    }


}
