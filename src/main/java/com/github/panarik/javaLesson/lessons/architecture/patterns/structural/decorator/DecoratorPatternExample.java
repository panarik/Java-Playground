package com.github.panarik.javaLesson.lessons.architecture.patterns.structural.decorator;

import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.decorator.basePizza.BasePizza;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.decorator.ingredients.MozzarellaIngredient;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.decorator.ingredients.TomatoSauceIngredient;
import com.github.panarik.javaLesson.lessons.architecture.patterns.structural.decorator.basePizza.Pizza;

public class DecoratorPatternExample {

    public static void main(String[] args) {

        Pizza pizza = new TomatoSauceIngredient(new MozzarellaIngredient(new BasePizza()));

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

    }

}
