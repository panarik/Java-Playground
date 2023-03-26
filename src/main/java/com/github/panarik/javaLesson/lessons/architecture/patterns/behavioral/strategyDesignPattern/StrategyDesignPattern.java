package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.strategyDesignPattern;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.strategyDesignPattern.data.Animal;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.strategyDesignPattern.data.Bird;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.strategyDesignPattern.data.Dog;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.strategyDesignPattern.data.flyable.CantFly;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.strategyDesignPattern.data.flyable.ItFlys;

/**
 * Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
 */
public class StrategyDesignPattern {

    public static void main(String[] args) {

        Animal dog = new Dog("Fad");
        Animal bird = new Bird("Ali");

        /*
        This parent method provides different behaviour for each type of objects.
        Different objects use the same parent method.
         */
        System.out.println("Dog trying to fly: " + dog.tryToFly());
        System.out.println("Bird trying to fly: " + bird.tryToFly());

        /*
        This parent method provides to set up different behavior for different objects.
         */
        dog.setFlyAbility(new ItFlys());
        bird.setFlyAbility(new CantFly());
        System.out.println("Dog trying to fly: " + dog.tryToFly());
        System.out.println("Bird trying to fly: " + bird.tryToFly());
    }

}
