package com.github.panarik.javaLesson.lessons.lang.oop.inheritance;

public class InheritanceExample {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        ;
        animals[1] = new Dog();

        // 1. Get inherited methods.
        for (Animal animal : animals) {
            System.out.println("Animal says: " + animal.getSound());
        }

        // 2. Get inherited methods.
        speakAnimal(animals[0]);


    }

    private static void speakAnimal(Animal animal) {
        System.out.println("Animal says: " + animal.getSound());
    }

}
