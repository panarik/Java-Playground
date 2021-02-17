package com.github.panarik.javaLesson.primitives;

public class IntExpression {

    public static void main(String[] args) {

        int a = 2021;
        int b = 35;
        int result = a - b;

        System.out.println(result);

        math();


    }

    public static void math() {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;  //y = 14

        x = y - x;  //x = 14-2 = 12
        y = y - x;  //y = 14-12 = 2

        System.out.println("\n"+x);
        System.out.println(y);
    }
}


