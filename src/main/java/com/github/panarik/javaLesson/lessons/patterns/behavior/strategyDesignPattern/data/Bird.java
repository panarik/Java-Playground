package com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data;

import com.github.panarik.javaLesson.lessons.patterns.behavior.strategyDesignPattern.data.flyable.ItFlys;

public class Bird extends Animal {

    public Bird(String name) {
        this.name = name;
        this.flyType = new ItFlys(); // Default behavior for current type of objects.
    }

}
