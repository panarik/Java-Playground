package com.github.panarik.javaLesson.operator;

public class IfSum {

    private static boolean result;


    public static void main(String[] args) {
        if10to20(4, 5);
        System.out.println(result);
    }

    private static boolean if10to20(int a, int b) {
        if ((a + b >= 10) & (a + b <= 20))
            result = true;
        else
            result = false;
        return result;
    }

}
