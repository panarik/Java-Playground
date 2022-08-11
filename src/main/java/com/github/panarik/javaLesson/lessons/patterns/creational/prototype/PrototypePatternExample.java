package com.github.panarik.javaLesson.lessons.patterns.creational.prototype;

public class PrototypePatternExample {

    public static void main(String[] args) {

        CloneFactory factory = new CloneFactory();
        Sheep silly = new Sheep();
        Sheep clonedSheep = (Sheep) factory.getCopy(silly);

        System.out.println("Silly id: " + System.identityHashCode(silly));
        System.out.println("Cloned sheep id: " + System.identityHashCode(clonedSheep));
    }

}
