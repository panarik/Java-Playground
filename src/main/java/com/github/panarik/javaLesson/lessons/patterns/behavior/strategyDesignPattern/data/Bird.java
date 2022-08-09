package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data;

public class Bird extends Animal {

    public Bird(String name) {
        this.name = name;
        this.flyType = new ItFlys();
    }

}
