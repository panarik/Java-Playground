package com.github.panarik.javaLesson.lessons.patterns.creational.prototype;

public class CloneFactory {

    public Animal getCopy(Animal animalSample) {
        return animalSample.makeCopy();
    }

}
