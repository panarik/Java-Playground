package com.github.panarik.javaLesson.lang.operator.operatorWhile;

public class while10 {


    public static void main(String[] args){

        int number = 3;
        int result = 1;
        int power = 1;

        while (power<=10) {
            result = result * number;
            System.out.println("число "+number+ " в степени " + power + " = "+ result);
            power++;
        }

    }

}
