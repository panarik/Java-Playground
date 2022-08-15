package com.github.panarik.javaLesson.lessons.patterns.structural.decorator.ingredients;

import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.PizzaDecorator;
import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.basePizza.BasePizza;
import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.basePizza.Pizza;

/**
 * Defines custom mozzarella pizza.
 */
public class TomatoSauceIngredient extends PizzaDecorator {

    public TomatoSauceIngredient(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce.");
    }

    /**
     * Modifies {@link BasePizza} description.
     *
     * @return Mozzarella pizza description.
     */
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato sauce";
    }

    /**
     * Modifies {@link BasePizza} cost.
     *
     * @return Mozzarella pizza cost.
     */
    public double getCost() {
        return tempPizza.getCost() + 0.35;
    }

}
