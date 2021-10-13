package com.github.panarik.javaLesson.season3.work6;

import java.util.ArrayList;

public class Solution {

    /*
     * 1. Добавить на серверную сторону чата логирование,
     * с выводом информации о действиях на сервере (запущен, произошла ошибка, клиент подключился, клиент прислал сообщение/команду).
     * Как минимум, заменить все sout
     *
     * Решение: https://github.com/panarik/JiraParser/pull/3
     * там логи + небольшой рефакторинг провел:
     */



    /*
     * 2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
     * Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
     * Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
     * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     * Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
     */


    public int[] postFour(int[] arr) {
        boolean isFour = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
            if (i == 4) {
                isFour = true;
                list.clear();
            }
        }
        if (!isFour) throw new RuntimeException("Array not have any 4!");

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    /*
     * 3. Написать метод, который проверяет состав массива из чисел 1 и 4.
     * Если в нем нет хоть одной четверки или единицы, то метод вернет false;
     * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     */
    public boolean isOneOrFour(int[] array) {
        for (int i : array) {
            if(i==1) return true;
            if (i==4) return true;
        }
        return false;
    }

}
