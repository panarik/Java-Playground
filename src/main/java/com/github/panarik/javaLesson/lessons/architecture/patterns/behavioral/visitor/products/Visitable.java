package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.products;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.visitor.visitors.Visitor;

/**
 * Ability for each product being visitable for {@link Visitor}
 */
public interface Visitable {

    /**
     * Being able to accept {@link Visitor}.
     *
     * @param visitor some {@link Visitor}
     * @return result of visitor work out.
     */
    int accept(Visitor visitor);

}
