package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.visitors.Visitor;

public class Alcohol implements Visitable {

    /**
     * Getting price for Alcohol.
     *
     * @return price.
     */
    public int getPrice() {
        return 500;
    }

    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
