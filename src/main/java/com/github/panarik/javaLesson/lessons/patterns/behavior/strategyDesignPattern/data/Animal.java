package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data;

public class Animal {

    protected String name;

    protected Flyable flyType; //Animal can fly, or can't.

    public void flyType() {
        System.out.println(flyType.fly());
    }

}
