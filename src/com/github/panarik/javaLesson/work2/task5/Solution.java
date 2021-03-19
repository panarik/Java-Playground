package com.github.panarik.javaLesson.work2.task5;

public class Solution {

    /*
     * 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */

    public static void main(String[] args) {

        int[] arr = {-5, -4, -3, -2, 500, -1, 0, 1, -500, 2, -99999, 3, 4, 5};

        int min = 0;
        //шаг 1. находим минимальное значение из первой пары
        min = Math.min(arr[0], arr[1]);

        //шаг 2. Сравниваем последовательно каждую пару и min и обновляем минимальное значение


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min) min = arr[i];
        }

        System.out.println("Минимальное значение массива arr[] = "+min);


    }

}
