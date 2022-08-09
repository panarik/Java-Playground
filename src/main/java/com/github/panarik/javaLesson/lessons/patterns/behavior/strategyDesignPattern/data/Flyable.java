package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data;

/**
 * This interface provides different possibility of flying for each creature.
 */
public interface Flyable {

    String fly();

}

/**
 * This class provides having ability of flying for creatures.
 */
class ItFlys implements Flyable {

    public String fly() {
        return "Flying";
    }
}

/**
 * This class provides lack of ability to fly.
 */
class CantFly implements Flyable {

    public String fly() {
        return "I can't fly";
    }

}
