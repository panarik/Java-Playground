package com.github.panarik.javaLesson.work.season1.work6.animals;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Dog extends Animal {


    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int distanceRun, int distanceSwim) {
        if (distanceSwim > 10) System.out.println("Собака " + name + " не проплывет " + distanceSwim + " метров");
        else if (distanceRun > 500) System.out.println("Собака " + name + " не пробежит " + distanceRun + " метров");
        else System.out.println("Собака " + name + " пробежала " + distanceRun + " метров и проплыла "+ distanceSwim+ " метров");


    }
}
