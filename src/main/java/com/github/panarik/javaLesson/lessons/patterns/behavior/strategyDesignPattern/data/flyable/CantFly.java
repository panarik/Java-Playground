package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data.flyable;

/**
 * This class provides lack of ability to fly.
 */
public class CantFly implements Flyable {

    public String fly() {
        return "I can't fly";
    }

}
