package com.github.panarik.javaLesson.work6.animals;


//1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }


    @Override
    public void run(int distanceRun, int distanceSwim) {
        if (distanceSwim > 0) System.out.println("Кот " + name + " не проплывет " + distanceSwim + " метров");
        if (distanceRun > 200) System.out.println("Кот " + name + " не пробежит " + distanceRun + " метров");
        else System.out.println("Кот " + name + " пробежал " + distanceRun + " метров.");


    }


}
