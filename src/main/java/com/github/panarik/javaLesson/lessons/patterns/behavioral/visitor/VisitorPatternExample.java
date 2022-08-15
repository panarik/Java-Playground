package com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor.products.Alcohol;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor.products.Food;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor.products.Tobacco;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor.products.Visitable;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor.visitors.TaxOnHolidayVisitor;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor.visitors.TaxVisitor;
import com.github.panarik.javaLesson.lessons.patterns.behavioral.visitor.visitors.Visitor;

/**
 * Represents different methods for different objects. Many types of products have many types of taxes.
 * Products use {@link Visitable} interface.
 * Different type of taxes can be defined with different types of {@link Visitor}
 */
public class VisitorPatternExample {

    public static void main(String[] args) {

        // Create many products.
        Alcohol alcohol = new Alcohol();
        Food food = new Food();
        Tobacco tobacco = new Tobacco();

        // Create several visitors for getting different taxes for each product.
        TaxVisitor basicVisitor = new TaxVisitor();
        TaxOnHolidayVisitor holidayVisitor = new TaxOnHolidayVisitor();

        // Get prices with basic taxes.
        System.out.println("Alcohol price: " + basicVisitor.visit(alcohol));
        System.out.println("Tobacco price: " + basicVisitor.visit(tobacco));
        System.out.println("Food price: " + basicVisitor.visit(food));

        // Get prices with holiday's taxes.
        System.out.println("Alcohol price in holidays: " + holidayVisitor.visit(alcohol));
        System.out.println("Tobacco price in holidays: " + holidayVisitor.visit(tobacco));
        System.out.println("Food price in holidays: " + holidayVisitor.visit(food));
    }

}
