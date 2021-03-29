package com.github.panarik.javaLesson.work6;

import com.github.panarik.javaLesson.work6.animals.Cat;
import com.github.panarik.javaLesson.work6.animals.Dog;

public class Main {

    public static void main(String[] agrs) {

//        Cat cat0 = new Cat("Loocky");
//        Cat cat1 = new Cat("Vaska");
//        Cat cat2 = new Cat("Barsik");
//        Dog dog1 = new Dog("Sharik");
//        Dog dog2 = new Dog("Artemon");
//
//        cat0.run(210,50);
//        cat1.run(210,0);
//        cat2.run(190, 0);
//        dog1.run(500, 10);
//        dog2.run(490,5);


        Cat[] arrCat = new Cat[3];
        Dog[] arrDog = new Dog[2];

        arrCat[0] = new Cat("Loocky");
        arrCat[1] = new Cat("Vaska");
        arrCat[2] = new Cat("Barsik");
        arrDog[0] = new Dog("Sharik");
        arrDog[1] = new Dog("Artemon");


        arrCat[0].run(200,50);
        arrCat[1].run(210,0);
        arrCat[2].run(190,0);

        arrDog[0].run(190, 10);
        arrDog[1].run(190, 20);







    }






}
