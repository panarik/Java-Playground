package com.github.panarik.javaLesson.work6;

import com.github.panarik.javaLesson.work6.animals.Cat;
import com.github.panarik.javaLesson.work6.animals.Dog;

public class Main {

    public static void main(String[] agrs) {

        Cat[] arrCat = new Cat[3];
        Dog[] arrDog = new Dog[2];

        arrCat[0] = new Cat("Lucky");
        arrCat[1] = new Cat("Vaska");
        arrCat[2] = new Cat("Barsik");

        arrDog[0] = new Dog("Sharik");
        arrDog[1] = new Dog("Artemon");


        System.out.println("Результаты тестирования животных:\n");
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
