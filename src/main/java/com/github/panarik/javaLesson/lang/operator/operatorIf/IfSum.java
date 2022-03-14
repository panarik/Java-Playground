package com.github.panarik.javaLesson.lang.operator.operatorIf;

public class IfSum {

    private static boolean result;


    public static void main(String[] args) {
        if10to20(4, 5);
        System.out.println(result);
    }

    private static boolean if10to20(int a, int b) {
        result = (a + b >= 10) & (a + b <= 20);
        return result;
    }

}
