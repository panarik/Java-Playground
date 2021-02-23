package com.github.panarik.javaLesson.operator;

public class MinIf {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        int min = minCalc(a, b);
        System.out.println("a=" + a + " b=" + b);
        System.out.println("Minimum is " + min);

    }

    private static int minCalc(int c, int d) {

        int min;
        if (c < d)
            min = c;
        else
            min = d;

        return min;
    }

}
