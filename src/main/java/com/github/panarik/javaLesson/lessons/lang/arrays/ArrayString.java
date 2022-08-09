package com.github.panarik.javaLesson.lessons.lang.arrays;

public class ArrayString {

    public static void main(String[] args) {

        String[] stringMassive = new String[5];
        stringMassive[0] = "Anna";
        stringMassive[1] = "Viktoria";
        stringMassive[2] = "Vera";
        stringMassive[3] = "Alisa";
        stringMassive[4] = "Alla";

        System.out.println("First string in array = " + stringMassive[0]);
        System.out.println("Array length = " + stringMassive.length);

        for (int i = 0; i < stringMassive.length; i++) {
            System.out.println("Array element №" + (i + 1) + " = " + stringMassive[i]);
        }
    }

}
