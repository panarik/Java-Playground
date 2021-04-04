package com.github.panarik.javaLesson.work6.animals;


//1. Создать классы Собака и Кот с наследованием от класса Животное.
public class Cat extends Animal {

    //создание обычных котов
    public Cat(String name) {
        this.name = name;
    }

    //создание домашних котов
    public Cat(String name, int appetite, boolean full) {
        this.name = name;
        this.appetite = appetite;
        this.full = full;
    }

    //создание бойцовских котов
    public Cat(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    //ограничения для бега и плавания у котов
    @Override
    public void run(int distanceRun, int distanceSwim) {
        if (distanceSwim > 0) System.out.println("Кот " + name + " не проплывет " + distanceSwim + " метров");
        else if (distanceRun > 200) System.out.println("Кот " + name + " не пробежит " + distanceRun + " метров");
        else System.out.println("Кот " + name + " пробежал " + distanceRun + " метров.");
    }

    //особенности драки котов
    @Override
    public void heat(Animal another) {
        super.heat(another);
        System.out.printf("%s бьет %s на величину %d урона. У %s остаётся %d здоровья\n", this.name, another.name, this.damage, another.name, another.health);
    }
}
