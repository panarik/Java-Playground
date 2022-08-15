package com.github.panarik.javaLesson.lessons.patterns.structural.decorator;

import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.basePizza.BasePizza;
import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.basePizza.Pizza;
import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.ingredients.MozzarellaIngredient;
import com.github.panarik.javaLesson.lessons.patterns.structural.decorator.ingredients.TomatoSauceIngredient;

public class DecoratorPatternExample {

    public static void main(String[] args) {

        Pizza pizza = new TomatoSauceIngredient(new MozzarellaIngredient(new BasePizza()));

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }

}
