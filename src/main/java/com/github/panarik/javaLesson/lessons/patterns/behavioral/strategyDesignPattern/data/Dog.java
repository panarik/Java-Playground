package com.github.panarik.javaLesson.lessons.patterns.behavioral.strategyDesignPattern.data;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.strategyDesignPattern.data.flyable.CantFly;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
        this.flyType = new CantFly();
    }

}
