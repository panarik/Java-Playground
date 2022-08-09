package com.github.panarik.javaLesson.lessons.lang.arrays;

import java.util.Arrays;

public class ArrayInt {

    public static void main(String[] args) {

        final int[] intMassive = new int[5];
        intMassive[0] = 10;
        intMassive[1] = 9000;
        intMassive[2] = 5;
        intMassive[3] = 55;
        intMassive[4] = -200;

//        sumArrays(intMassive);
//        findInArray(intMassive);
//        skippingIterationOnArray(intMassive);
        sortAsc();
//        sortDesc();
    }

    private static void sortDesc() {
        //аналогично по убыванию
        int[] arr2 = {1, 5, 32, 0, 9, 7, 20};

        for (int j = 1; j < arr2.length; j++) {
            int current = arr2[j];
            int cash = j;
            while (cash > 0 && arr2[cash - 1] < current) {
                arr2[cash] = arr2[cash - 1];
                cash--;
            }
            arr2[cash] = current;
        }
        System.out.println("по убыванию: " + Arrays.toString(arr2));
    }

    private static void sortAsc() {
        //сортировка руками (по возрастанию)
        int[] array = {4, 2, 78, 1, 56, 0, 9};
        for (int i = 1; i < array.length; i++) {
            // временная позиция в цикле,
            // которую будем:
            //      перебирать от текущей к началу,
            //      и перетаскивать значения от каждой предыдущей позиции к каждой текущей
            int tempIndex = i;
            //текущее значение,
            //которое будем тащить в начало массива,
            //до тех пор пока будут перед ним значения больше
            int current = array[i];

            while (tempIndex > 0 && array[tempIndex - 1] > current) {
                array[tempIndex] = array[tempIndex - 1];
                tempIndex--;
            }
            array[tempIndex] = current;
        }
        System.out.println("по возрастанию: " + Arrays.toString(array));
    }

    private static void skippingIterationOnArray(int[] intMassive) {
        // skipping some positions in the arrays
        for (int number : intMassive) {
            if (number % 2 != 0) continue;
            System.out.println("Number " + number + " is even.");
        }
    }

    private static void findInArray(int[] intMassive) {
        // Find something.
        for (int i = 0; i < intMassive.length; i++) {
            System.out.println("looking [" + i + "]: = " + intMassive[i]);
            if (intMassive[i] == 5) {
                System.out.println("Found 5 in element №" + i + ".");
                break;
            }
        }
        System.out.println("SUCCESS!");
    }

    private static void sumArrays(int[] intMassive) {
        // Sum arrays.
        int sum = 0;
        for (int i = 0; i < intMassive.length; i++) {
            sum = sum + intMassive[i];
            System.out.println("sum [" + i + "] = " + sum);
        }
        System.out.println("SUM: " + sum);
    }

}
