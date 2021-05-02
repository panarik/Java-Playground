package com.github.panarik.javaLesson.objects;

public class PetsClass {

    public static void main(String[] args) {

        Woman woman = new Woman(); //создали новый объект класса Woman и присваоили ему переменную woman

        Cat cat = new Cat();
        cat.owner = woman; //для переменной cat (класса Cat) и его поля owner (класса Woman) присвоили определенный объект с переменной woman (класса Woman)

        Dog dog = new Dog();
        dog.owner = woman;

        Fish fish = new Fish();
        fish.owner = woman;


    }


    public static class Cat {
        public Woman owner;
    }


    public static class Dog {
        public Woman owner;
    }


    public static class Fish {
        public Woman owner;
    }


    public static class Woman {
    }
}


