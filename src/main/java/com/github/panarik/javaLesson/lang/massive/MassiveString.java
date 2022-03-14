package com.github.panarik.javaLesson.lang.massive;

public class MassiveString {


    public static void main(String[] args) {

        String[] stringMassive = new String[5];
        stringMassive[0] = "Anna";
        stringMassive[1] = "Viktoria";
        stringMassive[2] = "Vera";
        stringMassive[3] = "Alisa";
        stringMassive[4] = "Alla";

        System.out.println("первая строка массива = " + stringMassive[0]);
        System.out.println("длина массива = " + stringMassive.length);

        for (int i = 0; i < stringMassive.length; i++) {
            System.out.println("элемент массива №"+(i+1)+" = "+stringMassive[i]);
        }


            String[] stringMassive2 = {"Anna", "Viktoria", "Vera", "Alisa", "Alla"};
        System.out.println(stringMassive2[0]);


    }


}
