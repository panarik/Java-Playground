package com.github.panarik.javaLesson.season1.work2.task1;

import java.util.Arrays;

public class Solution {

    /*
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void main(String[] args) {

        int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Массив array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }

        System.out.println("Массив array после инверсии: " + Arrays.toString(arr));

    }

}
