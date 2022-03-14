package com.github.panarik.javaLesson.work.season1.work6.items;

public class Box extends AbstractBowl {

    @Override
    public void putInto(int toolsAmount) {
        super.putInto(toolsAmount);
        System.out.printf("В коробку положили %dкг гвоздей. Теперь в ней %dкг гвоздей.\n", toolsAmount, this.amount);
    }
}
