package com.github.panarik.javaLesson.lessons.patterns.structural.decorator;

import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.basePizza.Pizza;

/**
 * Decorator for any pizza.
 * Provides custom cost and custom description to empty pizza.
 */
public abstract class PizzaDecorator implements Pizza {

    // In this pizza will be added another ingredients.
    protected Pizza tempPizza;

    public PizzaDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }

}
