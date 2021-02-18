package com.github.panarik.javaLesson.primitives;

public class StringExpression {

    public static void main(String[] args) {

        String s = "String one with " + "String two";
        System.out.println(s);

        String s1 = "s1";
        String s2 = "s2";
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        int a = 333;
        String stringCompare2 = "String with int " + a;
        System.out.println(stringCompare2);
    }

}
