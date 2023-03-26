package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.visitors;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Food;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Alcohol;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Tobacco;

/**
 * One of types of {@link Visitor}. This visitor goes through products and calculates new price with different taxes.
 * Each type of products has his own taxes.
 */
public class TaxVisitor implements Visitor {

    public int visit(Alcohol alcoholObject) {
        return (int) (alcoholObject.getPrice() * 1.2);
    }

    public int visit(Tobacco tobaccoObject) {
        return (int) (tobaccoObject.getPrice() * 1.55);
    }

    public int visit(Food foodObject) {
        return foodObject.getPrice();
    }

}
