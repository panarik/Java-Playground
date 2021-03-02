package com.github.panarik.javaLesson.operator;

public class IfOne {

    static int a = 5;
    static int b = 7;
    static int min = 0;


    public static void main(String[] args) {
        min = minCalc(a, b);

        System.out.println("a=" + a + " b=" + b);
        System.out.println("Minimum is " + min);

        positiveOrNegative(100);
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


}
