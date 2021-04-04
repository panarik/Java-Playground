package com.github.panarik.javaLesson.work6;

import com.github.panarik.javaLesson.work6.animals.Cat;
import com.github.panarik.javaLesson.work6.animals.Dog;
import com.github.panarik.javaLesson.work6.items.Box;
import com.github.panarik.javaLesson.work6.items.Cup;

public class Main {

    public static void main(String[] agrs) {

        //testAnimals();
        feedAnimals();
        //heatAnimals();

    }

    private static void heatAnimals() {
        System.out.println("\nАКТ №3: Животные деруться.");
        Cat cat3 = new Cat("Борец", 100, 10);
        Cat cat4 = new Cat("Счастливчик", 150, 6);
        while (true) {
            cat3.heat(cat4);
            if (cat4.getHealth() <= 0) {
                System.out.println(cat3.getName() + " Победил.");
                break;
            }
            cat4.heat(cat3);
            if (cat3.getHealth() <= 0) {
                System.out.println(cat4.getName() + " Победил.");
                break;
            }

        }
    }

    private static void feedAnimals() {
        System.out.println("\nАКТ №2: Животные едят.");
        Cup cup = new Cup();
        Box box = new Box();

        System.out.println("Приходит первый кот.");
        Cat cat1 = new Cat("Барсик", 10, false);
        cup.putInto(15);
        cat1.eat(cup);

        System.out.println("\nПриходит второй кот.");
        Cat cat2 = new Cat("Тузик", 10, false);
        box.putInto(30);
        cat2.eat(box);

        System.out.println("\nПриходит третий кот.");
        Cat cat3 = new Cat("Эрик", 10,false);
        cup.putInto(5);
        cat3.eat(cup);
    }

    private static void testAnimals() {
        Cat[] arrCat = new Cat[3];
        Dog[] arrDog = new Dog[2];
        arrCat[0] = new Cat("Lucky");
        arrCat[1] = new Cat("Vaska");
        arrCat[2] = new Cat("Barsik");
        arrDog[0] = new Dog("Sharik");
        arrDog[1] = new Dog("Artemon");
        System.out.println("Акт №1. Результаты тестирования животных:\n");
        arrCat[0].run(200, 50);
        arrCat[1].run(210, 0);
        arrCat[2].run(190, 0);
        arrDog[0].run(490, 10);
        arrDog[1].run(500, 20);
        arrDog[1].run(1500, 10);
        System.out.println("\nВсего животных участвовало в тестировании: " + (arrCat.length + arrDog.length));
        System.out.println("Ни одно животное не пострадало.");
    }


}
