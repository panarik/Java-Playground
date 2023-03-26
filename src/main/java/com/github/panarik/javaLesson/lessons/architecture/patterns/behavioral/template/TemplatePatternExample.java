package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.template;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.template.burger.CustomBurger;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.template.burger.TemplateBurger;

/**
 * This class represents making burgers restaurant.
 */
public class TemplatePatternExample {

    public static void main(String[] args) {

        // Make template burger with custom ingredients.
        TemplateBurger burger = new CustomBurger();
        burger.makeBurger();

    }


}
