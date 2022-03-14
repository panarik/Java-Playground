package com.github.panarik.javaLesson.work.season2.work2;

public class Solution {

    /*
     * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
     * при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
     *
     * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
     * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
     * должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
     *
     * 3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException,
     * и вывести результат расчета.
     */

    public static void main(String[] args) {

        Object[][] a = {
                {1, "ы", 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };

        //проверяем на длину
        System.out.println(massive4x4(a));
        //проверяем на инты
        System.out.println("Сумма значений массива: "+massiveSum(a));
    }

    private static boolean massive4x4(Object[][] a) {

        int sum1 = 0; //сумма строк первого масива
        int sum2 = 0; //сума строк второго массива

        //проверяем первый массив
        if (a.length != 4) throw new MyArraySizeException();

        //проверяем второй массив
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != 4) throw new MyArraySizeException();
        }
        return true;
    }

    private static int massiveSum(Object[][] a) {

        int sum = 0;
        int i= 0;
        int j = 0;

        try {
            for (i = 0; i < a.length; i++) {
                for (j = 0; j < a[i].length; j++) {
                    sum += Integer.parseInt(a[i][j].toString());
                }
            }
        } catch (RuntimeException e) {
            throw new MyArrayDataException(String.format("In cell [%d][%d] contains not a Integer at all. Please kill Your self", i, j));
        }

        return sum;
    }


}
