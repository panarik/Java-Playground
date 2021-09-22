package com.github.panarik.javaLesson.season3.work1;

import com.github.panarik.javaLesson.season3.work1.model.Apple;
import com.github.panarik.javaLesson.season3.work1.model.Box;
import com.github.panarik.javaLesson.season3.work1.model.Fruit;
import com.github.panarik.javaLesson.season3.work1.model.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        /*
        1. Написать метод, который меняет два элемента массива местами.
        (массив может быть любого ссылочного типа);
        */
        Integer[] array = new Integer[3];
        array[0] = 100;
        array[2] = 202;
        swap(array, 0, 2);
        System.out.println(array[0]);
        System.out.println(array[2]);


        /*
        2. Написать метод, который преобразует массив в ArrayList;
         */
        Integer[] arr = new Integer[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        System.out.println(createArrayList(arr));

        /*
        Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
        Класс Box, в который можно складывать фрукты.
        Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        Для хранения фруктов внутри коробки можно использовать ArrayList;
        */
        Box<Fruit> boxFruit = new Box<>();
        boxFruit.addFruit(new Apple()); //кладем в коробку яблоко
        System.out.println(boxFruit.viewFruits()); //смотрим, что в коробке
        boxFruit.addFruit(new Orange()); //кладем в коробку апельсин
        System.out.println(boxFruit.viewFruits()); //смотрим, что в коробке
    }

    private static <A> A[] swap(A[] array, int first, int second) {
        A temp = array[first];
        array[first] = array[second];
        array[second] = temp;
        return array;
    }

    private static <E> ArrayList<E> createArrayList(E[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }


}
