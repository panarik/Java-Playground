package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.template.burger;

/**
 * Defines abstract burger with default ingredients.
 */
public abstract class TemplateBurger {

    /**
     * Makes burger with optional ingredients.
     */
    public final void makeBurger() {
        addBread();
        if (wantMeat()) System.out.println("Adding meat.");
        if (wantCheese()) System.out.println("Adding cheese.");
        if (wantCucumbers()) System.out.println("Adding cucumbers.");
        if (wantTomatoes()) System.out.println("Adding tomatoes.");
        wrapBurger();
    }

    /**
     * Hook method.
     * Define ingredients which custom burger can avoid.
     * If meat don't need just {@link Override} it with {@link false}.
     *
     * @return {@link true} because by default burger contains meat.
     */
    protected boolean wantMeat() {
        return true;
    }

    /**
     * Hook method.
     * Define ingredients which custom burger can avoid.
     * If cheese don't need just {@link Override} it with {@link false}.
     *
     * @return {@link true} because by default burger contains cheese.
     */
    protected boolean wantCheese() {
        return true;
    }

    /**
     * Hook method.
     * Define ingredients which custom burger can avoid.
     * If cucumbers don't need just {@link Override} it with {@link false}.
     *
     * @return {@link true} because by default burger contains cucumbers.
     */
    protected boolean wantCucumbers() {
        return true;
    }

    /**
     * Hook method.
     * Define ingredients which custom burger can avoid.
     * If tomatoes don't need just {@link Override} it with {@link false}.
     *
     * @return {@link true} because by default burger contains tomatoes.
     */
    protected boolean wantTomatoes() {
        return true;
    }

    /**
     * Define some bread for burger which must have any custom burger.
     * Custom burger can use custom bread. Just {@link Override} this method for it.
     */
    protected void addBread() {
        System.out.println("Making bread for burger.");
    }

    /**
     * Define some works which must have any custom burger.
     * Custom burger can have custom works. Just {@link Override} this method for it.
     */
    protected void wrapBurger() {
        System.out.println("Wrapping burger in paper.");
    }

}
