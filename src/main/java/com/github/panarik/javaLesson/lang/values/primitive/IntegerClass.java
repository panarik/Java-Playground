package com.github.panarik.javaLesson.lang.values.primitive;

public class IntegerClass {

    public static void main(String[] args) {
        Integer i = 50000;
        Integer i2 = 90000;
        Integer i3 = 90000;
        System.out.println(i);

        //.byteValue()
        System.out.println(i.byteValue());

        //.compareTo()
        System.out.println(i.compareTo(i2));
        System.out.println(i2.compareTo(i3));

        //.compare()
        System.out.println(Integer.compare(i, i2));
        System.out.println(Integer.compare(i2, i3));

        //.doubleValue()
        System.out.println(i.doubleValue());

        //.parseInt()
        String s = "123";
        //проверяем на цифры
        boolean isDigit = true;
        for (Character ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) isDigit = false;
        }
        if (isDigit) System.out.println(Integer.parseInt(s));

        //.bitCount()
        System.out.println("bitsCount: " + Integer.bitCount(5));

        //.max()
        System.out.println("max: " + Integer.max(i, i2));

        //.min()
        System.out.println("min: " + Integer.min(i, i2));

        System.out.println("parse 0x0000001a to int: "+ Integer.decode("0x0000001a"));


    }

}
