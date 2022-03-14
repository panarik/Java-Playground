package com.github.panarik.javaLesson.lang.operator.operatorIf;

public class IfOne {

    static int a = 5;
    static int b = 7;
    static int min = 0;


    public static void main(String[] args) {
        min = minCalc(a, b);

        System.out.println("a=" + a + " b=" + b);
        System.out.println("Minimum is " + min);

        //Выводим, положительное число или отрицательное
        positiveOrNegative(100);

        //выводим, положительное число или отрицательное (если отрицательное, то TRUE)
        System.out.println(positiveOrNegative2(50));
    }


    private static int minCalc(int c, int d) {
        int min;
        if (c < d)
            min = c;
        else
            min = d;
        return min;
    }


    private static void positiveOrNegative(int x) {

        if (x >= 0)
            System.out.println("Поздравляю. Вы только что передали положительное число");
        else
            System.out.println("Поздравляю. Вы только что передали отрицательное число");
    }


    private static boolean positiveOrNegative2(int x) {
        boolean i;

        if (x<0)
            i = true;
        else
            i = false;

        return i;
    }


}
