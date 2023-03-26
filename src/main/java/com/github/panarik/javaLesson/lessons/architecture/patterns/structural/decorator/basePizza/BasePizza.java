package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.decorator.basePizza;

/**
 * This class represented blank Pizza with concrete description and cost.
 */
public class BasePizza implements Pizza {

    public BasePizza() {
        System.out.println("Adding dough.");
    }

    /**
     * Return description for black pizza.
     *
     * @return
     */
    public String getDescription() {
        return "Blank dough";
    }

    /**
     * Return black pizza cost.
     *
     * @return
     */
    public double getCost() {
        return 1.00;
    }

}
