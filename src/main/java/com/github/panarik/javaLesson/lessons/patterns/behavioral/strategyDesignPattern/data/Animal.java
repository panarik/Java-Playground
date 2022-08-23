package com.github.panarik.javaLesson.lessons.patterns.behavioral.strategyDesignPattern.data;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.strategyDesignPattern.data.flyable.Flyable;

/**
 * Instead of using an interface in a traditional way we use an instance variable that is a subclass of the Flys interface.
 * Animal doesn't care what flyingType does, it just knows the behavior is available to its subclasses.
 * This is known as Composition : Instead of inheriting an ability through inheritance the class is composed with Objects with the right ability
 * Composition allows to change the capabilities of objects at run time.
 */
public class Animal {

    protected String name;
    protected Flyable flyType; //Animal can fly, or can't.

    public String tryToFly() {
        return this.flyType.fly();
    }

    /**
     * Possibility to change the flyingType dynamically.
     *
     * @param flyType animal can fly of can't.
     */
    public void setFlyAbility(Flyable flyType) {
        this.flyType = flyType;
    }

}
