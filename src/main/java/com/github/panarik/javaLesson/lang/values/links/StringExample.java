package com.github.panarik.javaLesson.lang.values.links;

import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

        System.out.println("Hell" + "o!");
        String s1 = "Hell";
        String s2 = "o!";
        System.out.println(s1 + s2);

        String s3 = new String("Hello!");
        String s4 = new String(new char[]{'H','e','l','l','o','!'});
        String s5 = new String(new byte[]{28,49,18,98,55,34});
        String s6 = new String(s3);

        Scanner scanner = new Scanner(System.in);
        String s7 = scanner.next();

        //String + Int
        int a = 1;
        System.out.println("String with int " + a);
        System.out.println("1" + (1+3) );




    }

}
