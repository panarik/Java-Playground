package com.github.panarik.javaLesson.work.season2.work5;

import java.util.Arrays;

public class Solution {

    /*
    *
    * 1. Необходимо написать два метода, которые делают следующее:
    * 1) Создают одномерный длинный массив, например:
    * static final int size = 10000000;
    * static final int h = size / 2;
    * float[] arr = new float[size];

2) Заполняют этот массив единицами;
3) Засекают время выполнения: long a = System.currentTimeMillis();
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
5) Проверяется время окончания метода System.currentTimeMillis();
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);

Отличие первого метода от второго:
Первый просто бежит по массиву и вычисляет значения.
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.

Пример деления одного массива на два:

System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h);

Пример обратной склейки:

System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h);

Примечание:
System.arraycopy() – копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
По замерам времени:
Для первого метода надо считать время только на цикл расчета:

for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
}

Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.

Не забудьте выполнить в конце Arrays.equals(arr1, arr2) СРАВНЕНИЕ МАССИВОВ ИЗ ПЕРВОГО МЕТОДА И ВТОРОГО!!!
     */
    private static long timeSingle;
    private static long timeMultiple;
    private static float[] arr1;
    private static float[] arr2;
    private final static int size = 10000000;
    private final static int h = size / 2;

    public static void main(String[] args) {

        arr1 = new float[size];
        arr2 = new float[size];
        Arrays.fill(arr1, 1);
        Arrays.fill(arr2, 1);

        massive();
        massiveMultiThreading();
        System.out.println("Массивы идентичны: "+Arrays.equals(arr1, arr2));

    }

    private static void massive() {
        //засекаем время
        long startTime = System.currentTimeMillis();
        //выполняем действия и считаем время
        for (int i = 0; i< arr1.length; i++) {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endTime = System.currentTimeMillis();
        timeSingle = endTime - startTime;
        System.out.println("Время одного потока: "+timeSingle);

    }

    private static void massiveMultiThreading() {
        //засекаем время
        long startTime = System.currentTimeMillis();
        //создаём субмассивы
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        System.arraycopy(arr2, 0, a1, 0, h);
        System.arraycopy(arr2, h, a2, 0, h);

        //создаём поток #1
        Thread t1 = new Thread(() -> {
            //выполняем действия
            for (int i = 0; i< a1.length; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        //создаём поток #2
        Thread t2 = new Thread(() -> {
            //выполняем действия
            for (int i = 0; i< a2.length; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        //запускаем потоки и дожидаемся выполнения
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //склеиваем обработанные субмассивы
        System.arraycopy(a1, 0, arr2, 0, h);
        System.arraycopy(a2, 0, arr2, h, h);

        long endTime = System.currentTimeMillis();
        timeMultiple = endTime - startTime;
        System.out.println("Время двух потоков: "+timeMultiple);

    }


}
