package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.visitors;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Food;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Alcohol;
import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products.Tobacco;

/**
 * Defines basic Visitor which can be specialized with different visitors.
 * Each Visitor will go to different products and do something with those products.
 */
public interface Visitor {

    /**
     * Calculates new price with taxes for Alcohol.
     * Taxes for alcohol is 20%.
     *
     * @param alcoholObject Some weight of alcohol.
     * @return price with taxes for Alcohol.
     */
    int visit(Alcohol alcoholObject);

    /**
     * Calculates new price with taxes for Tobacco.
     * Taxes for tobacco is 55%.
     *
     * @param tobaccoObject Some weight of alcohol.
     * @return price with taxes for Tobacco.
     */
    int visit(Tobacco tobaccoObject);

    /**
     * Calculates new price with taxes for Food.
     * Taxes for food is 0%.
     *
     * @param foodObject Some weight of alcohol.
     * @return price with taxes for Food.
     */
    int visit(Food foodObject);

}
