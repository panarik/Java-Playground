package com.github.panarik.javaLesson.season3.work1;

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
