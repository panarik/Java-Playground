package com.github.panarik.javaLesson.lessons.lang.arrays;

import java.util.Arrays;

public class ArrayInt {


    public static void main(String[] args) {

        int[] intMassive = new int[5];
        intMassive[0] = 10;
        intMassive[1] = 9000;
        intMassive[2] = 5;
        intMassive[3] = 55;
        intMassive[4] = -200;

        //суммируем
        int sum = 0;
        for (int i = 0; i < intMassive.length; i++) {
            sum = sum + intMassive[i];
            System.out.println("sum [" + i + "] = " + sum);
        }
        System.out.println("ИТОГО: " + sum);

        //ищем значение
        for (int i = 0; i < intMassive.length; i++) {
            System.out.println("перебираю элемент[" + i + "]: = " + intMassive[i]);
            if (intMassive[i] == 5) {
                System.out.println("в элементе №" + i + " Нашел 5!");
                break;
            }
        }
        System.out.println("ГОТОВО!");


        // по условию пропускаем итерации в цикле.
        // тут нати ошибку. Скорее всего в условии поставить вместо номера само значение в текущем элементе
        for (int i = 0; i < intMassive.length; i++) {
            if (i % 2 != 0) continue;
            System.out.println("Число " + intMassive[i] + " - четное");
        }

        //сортировка руками (по возрастанию)
        int[] array = {4, 2, 78, 1, 56, 0, 9};
        for (int i = 1; i < array.length; i++) {
            // временная позиция в цикле,
            // которую будем:
            //      перебирать от текущей к началу,
            //      и перетаскивать значения от каждой предыдущей позиции к каждой текущей
            int cash = i;
            //текущее значение,
            //которое будем тащить в начало массива,
            //до тех пор пока будут перед ним значения больше
            int current = array[i];

            while (cash > 0 && array[cash - 1] > current) {
                array[cash] = array[cash - 1];
                cash--;
            }
            array[cash] = current;
        }
        System.out.println("по возрастанию: "+Arrays.toString(array));

        //аналогично по убыванию
        int[] arr2 = {1,5,32,0,9,7,20};

        for(int j = 1; j< arr2.length; j++) {
            int current = arr2[j];
            int cash = j;
            while (cash>0 && arr2[cash-1]<current) {
                arr2[cash] = arr2[cash-1];
                cash--;
            }
            arr2[cash] = current;
        }
        System.out.println("по убыванию: "+Arrays.toString(arr2));
    }


}
