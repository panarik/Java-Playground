package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.template.burger;

/**
 * Defines custom burger without some ingredients from template burgers.
 */
public class CustomBurger extends TemplateBurger {

    /**
     * Custom burger don't needed cheese.
     *
     * @return {@link false}
     */
    @Override
    protected boolean wantCheese() {
        return false;
    }

}
