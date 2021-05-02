package com.github.panarik.javaLesson.values.links;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //вычислить палиндром
        String s8 = scanner.next();
        StringBuilder sbuild = new StringBuilder(s8);
        if (sbuild.toString().equals(sbuild.reverse().toString())) System.out.println("Это палиндом!");

    }

}
