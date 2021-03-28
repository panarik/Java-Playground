package com.github.panarik.javaLesson.task1;

public class SolutionOne {

    /*
    Написать метод вычисляющий выражение a * (b + (c / d))
    и возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
    */

    public static void main(String[] args) {
        System.out.println(arithmeticCalc(1, 2, 3, 4));
    }

    private static float arithmeticCalc(int a, int b, int c, int d) {
        float result = a * (b + (c / d));
        return result;
    }


}
