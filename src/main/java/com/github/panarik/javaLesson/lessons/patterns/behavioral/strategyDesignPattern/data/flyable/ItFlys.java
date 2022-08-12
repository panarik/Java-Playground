package com.github.panarik.javaLesson.lessons.patterns.behavioral.strategyDesignPattern.data.flyable;

/**
 * This class provides having ability of flying for creatures.
 */
public class ItFlys implements Flyable {

    public String fly() {
        return "Flying";
    }
}
