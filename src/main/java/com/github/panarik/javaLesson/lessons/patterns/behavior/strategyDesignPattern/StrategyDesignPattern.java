package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern;

import com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data.Animal;
import com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data.Bird;
import com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data.Dog;

public class StrategyDesignPattern {

    public static void main(String[] args) {

        Animal dog = new Dog("Fad");
        Animal bird = new Bird("Ali");

        // different objects use the same parent method.
        // This parent method provides different behaviour for each type of objects.
        dog.flyType();
        bird.flyType();
    }

}
