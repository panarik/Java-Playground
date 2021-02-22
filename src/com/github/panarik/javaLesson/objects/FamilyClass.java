package com.github.panarik.javaLesson.objects;

public class FamilyClass {

    public static void main(String[] args) {

        Man man = new Man(); //инициализируем новый объект класса Man
        Woman woman = new Woman(); //инициализируем новый объект класса Woman
        man.wife = woman;
        woman.husband = man;




    }

    public static class Man{
        int age;
        int weight;
        public Woman wife;
    }

    public static class Woman {
        int age;
        int weight;
        public Man husband; // поздаём внутри класса Woman переменную класса Man
    }

}
