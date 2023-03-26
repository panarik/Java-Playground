package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.visitors;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Food;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Tobacco;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Alcohol;

/**
 * One of types of {@link Visitor}. This visitor goes through products and calculates new price with different taxes.
 * Each type of products has his own taxes.
 */
public class TaxOnHolidayVisitor implements Visitor {

    /**
     * Returned holiday taxes for alcohol.
     *
     * @param alcoholObject Some weight of alcohol.
     * @return
     */
    public int visit(Alcohol alcoholObject) {
        return (int) (alcoholObject.getPrice() * 1.1);
    }

    /**
     * Returned holiday taxes for tobacco.
     *
     * @param tobaccoObject Some weight of tobacco.
     * @return
     */
    public int visit(Tobacco tobaccoObject) {
        return (int) (tobaccoObject.getPrice() * 1.4);
    }

    /**
     * Returned holiday taxes for food.
     *
     * @param foodObject Some weight of food.
     * @return
     */
    public int visit(Food foodObject) {
        return foodObject.getPrice();
    }

}


