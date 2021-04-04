package com.github.panarik.javaLesson.work6.animals;

import com.github.panarik.javaLesson.work6.items.AbstractBowl;
import com.github.panarik.javaLesson.work6.items.Box;
import com.github.panarik.javaLesson.work6.items.Cup;

public abstract class Animal {

    protected String name; //имя животного
    protected int appetite; //аппетит животного
    protected int health; //здоровье животного
    protected int damage; //урон, который может наносить животное
    protected boolean full; //сытость

    //животное может бежать
    protected void run(int distanceRun, int distanceSwim) {
        System.out.println(name + " пробежал " + distanceRun + " метров и проплыл " + distanceSwim + " метров.");
    }

    //животное может есть из миски
    public void eat(AbstractBowl abstractBowl) {
        System.out.printf("%s голоден.\n", this.name);
        //если чашка с едой
        if (abstractBowl instanceof Cup) {
            if (abstractBowl.getAmount() > this.appetite) {
                abstractBowl.decrease(appetite);
                this.full = true;
                System.out.printf("%s съел %d еды. ", this.name, appetite);
                System.out.printf("Осталось %d еды.\n", abstractBowl.getAmount());
            } else System.out.println("Коту нехватает еды.");
        }
        //если коробка с гвоздями
        else if (abstractBowl instanceof Box) System.out.printf("%s не будет есть гвозди из коробки.\n", this.name);
        else System.out.println("Кот вообще не понимает, что с этой посудиной делать.");

        if (this.full) System.out.printf("%s сыт.\n", this.name);
        else System.out.printf("%s всё еще голоден.\n", this.name);
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

    public void setFull(boolean full) {
        this.full = full;
    }
}
