package com.github.panarik.javaLesson.primitives;

import java.util.Date;

public class CreatePrimitivesClass {

    String s = new String();
    String s1 = "";

    int a;
    int a1 = 5;
    int a2 = 5, b2 = 7;
    int a3 = 5, b3 = a3+2;

    boolean isTrue = true;
    boolean isLess = (5>6);

    private static Date date = new Date();


    public static void main(String[] args) {

        System.out.println(date);

    }

}
