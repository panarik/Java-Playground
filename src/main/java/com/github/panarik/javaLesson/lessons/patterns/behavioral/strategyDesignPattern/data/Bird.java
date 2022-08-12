package com.github.panarik.javaLesson.lessons.patterns.behavioral.strategyDesignPattern.data;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.strategyDesignPattern.data.flyable.ItFlys;

public class Bird extends Animal {

    public Bird(String name) {
        this.name = name;
        this.flyType = new ItFlys(); // Default behavior for current type of objects.
    }

}
