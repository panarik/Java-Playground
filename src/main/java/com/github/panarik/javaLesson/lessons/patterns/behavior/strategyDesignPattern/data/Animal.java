package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data;

import com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data.flyable.Flyable;

public class Animal {

    protected String name;
    protected Flyable flyType; //Animal can fly, or can't.

    public String tryToFly() {
        return this.flyType.fly();
    }

    public void setFlyAbility(Flyable flyType) {
        this.flyType = flyType;
    }

}
