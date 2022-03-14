package com.github.panarik.javaLesson.work.season1.work2.task6;

import java.util.Arrays;

public class Solution {

    /*
     * 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
     * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры:
     *  - checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
     *  - checkBalance([1, 1, 1, || 2, 1]) → true,
     *  - граница показана символами ||, эти символы в массив не входят.
     */
    static boolean balance;


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 1, 1};
        checkBalance(arr);
        System.out.println("на выходе: (пока замокал)" + balance);
    }


    private static boolean checkBalance(int[] arr) {
        balance = false;


        System.out.println("Получаем массив" + Arrays.toString(arr));

        //проходим все варианты нахождения баланса

        for (
                int cycle = 0, //количество циклов
                leftSite = 0, //пара слева
                rightSite = (arr.length - 2); //правая сторона массива
                cycle < (arr.length - 2); //ограничение на количество проходов
                cycle++, //счетчик циклов
                        leftSite++, //каждый цикл увеличивается количество пар слева
                        rightSite-- //каждый цикл уменьшается количество пар справа

        ) {
            System.out.println("проход №" + (cycle));
            //TODO тут делаем if() который сравнивает суммы пар на каждой стороне


        }

        return balance;
    }


}
