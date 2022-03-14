package com.github.panarik.javaLesson.work.season1.work6.animals;

import com.github.panarik.javaLesson.work.season1.work6.items.AbstractBowl;
import com.github.panarik.javaLesson.work.season1.work6.items.Box;
import com.github.panarik.javaLesson.work.season1.work6.items.Cup;

abstract class Animal {

    protected String name; //имя животного
    protected int appetite; //аппетит животного
    protected int health; //здоровье животного
    protected int damage; //урон, который может наносить животное

    //животное может бежать
    protected void run(int distanceRun, int distanceSwim) {
        System.out.println(name + " пробежал " + distanceRun + " метров и проплыл " + distanceSwim + " метров.");
    }

    //животное может есть из миски
    public void eat(AbstractBowl abstractBowl) {
        if (abstractBowl instanceof Cup) {
            abstractBowl.decrease(appetite);
            System.out.printf("%s съел %d еды. ", this.name, appetite);
            System.out.printf("Осталось %d еды.\n", abstractBowl.getAmount());
        } else if (abstractBowl instanceof Box) System.out.printf("%s не будет есть гвозди из коробки.\n", this.name);

    }

    //Животное может наносить урон
    protected void heat(Animal another) {
        another.health -= this.damage;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
}
