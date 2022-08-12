package com.github.panarik.javaLesson.lessons.patterns.structure.decorator.ingredients;

import com.github.panarik.javaLesson.lessons.patterns.structure.decorator.basePizza.BasePizza;
import com.github.panarik.javaLesson.lessons.patterns.structure.decorator.basePizza.Pizza;
import com.github.panarik.javaLesson.lessons.patterns.structure.decorator.PizzaDecorator;

/**
 * Defines custom mozzarella pizza.
 */
public class MozzarellaIngredient extends PizzaDecorator {

    public MozzarellaIngredient(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding mozzarella.");
    }

    /**
     * Modifies {@link BasePizza} description.
     *
     * @return Mozzarella pizza description.
     */
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    /**
     * Modifies {@link BasePizza} cost.
     *
     * @return Mozzarella pizza cost.
     */
    public double getCost() {
        return tempPizza.getCost() + 0.5;
    }

}
