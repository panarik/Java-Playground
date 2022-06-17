package com.github.panarik.javaLesson.lessons.lang.format;

import java.text.DecimalFormat;

public class DecimalFormatEx {

    public static void main(String[] args) {
        usePattern(15.123456789, "0.00");
        usePattern(1234567890, "00");
    }

    private static void usePattern(Number number, String pattern) {
        System.out.println("Decimal of " + number + " is: " + new DecimalFormat(pattern).format(number));
    }


}
