package com.github.panarik.javaLesson.lessons.lang.values.links;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s8 = scanner.next();

        //вычислить палиндром
        System.out.println(isPalindrom(s8));
        }

    private static boolean isPalindrom(String s8) {
        return new StringBuilder(s8).reverse().toString().equals(s8);
    }

}
