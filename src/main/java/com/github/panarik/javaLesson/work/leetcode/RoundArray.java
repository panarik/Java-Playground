package com.github.panarik.javaLesson.work.leetcode;

public class RoundArray {

    public static void main(String[] args) {

        System.out.println(getDigitByIndex(5));
        System.out.println(getDigitByIndex(6));
        System.out.println(getDigitByIndex(7));
        System.out.println(getDigitByIndex(8));
        System.out.println(getDigitByIndex(9));
        System.out.println(getDigitByIndex(10));
    }

    private static int getDigitByIndex(int index) {
        var array = new int[]{0, 1, 2, 3, 4, 5};
        var digit = array[index % array.length];
        return digit;
    }

}
