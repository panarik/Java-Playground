package com.github.panarik.javaLesson.season1.work2.task5;

public class Solution {

    /*
     * 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */

    public static void main(String[] args) {

        int[] arr = {-5, -4, 200 -3, -2, 500, -1, 0, 98522, 1, -500, 2, -99999, 3, 4, 5};

        //MIN
        //шаг 1. находим минимальное значение из первой пары
        int min = Math.min(arr[0], arr[1]);
        //шаг 2. Сравниваем последовательно каждую пару и min и обновляем минимальное значение
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]< min) min = arr[i];
        }
        // вывод результата
        System.out.println("Минимальное значение массива arr[] = "+min);

        //MAX
        //шаг 1. находим макс значение из первой пары
        int max = Math.min(arr[0], arr[1]);
        //шаг 2. Сравниваем последовательно каждую пару и max и обновляем максимальное значение
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max) max = arr[i];
        }
        //Вывод результата
        System.out.println("Максимальное значение массива arr[] = "+max);
    }

}
