package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
        this.flyType = new CantFly();
    }

}
