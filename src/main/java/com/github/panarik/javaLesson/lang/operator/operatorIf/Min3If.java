package com.github.panarik.javaLesson.lang.operator.operatorIf;

public class Min3If {

    public static int min(int a, int b, int c) {

        //сравниваем первые две переменные и минимум возвращаем в переменной min1
        int min1 = 0;
        if (a < b)
            min1 = a;
        else
            min1 = b;

        /* Сравниваем результат первого сравнения и третьей переменной
           Если третья переменная меньше результата сравнения первых двух, то она самая минимальная
        */
        int min2 = 0;
        if (c < min1)
            min2 = c;
        else min2 = min1;

        return min2;



        /*
        if (a < b)
            min = a;
        else if (a < c)
            min = a;
        else if (b < c)
            min = b;

        else if (b < a)
            min = b;
        else if (c < a)
            min = c;
        else if (c < b)
            min = c;
         */

    }

    public static void main(String[] args) {

        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}


