package com.github.panarik.javaLesson.lang.values.primitive;

public class ExamplePrimitive {

    public static void main(String[] args) {

        //целые
        byte byteOne = -128;
        byte byteTwo = 127;
        short shortOne = -32_768;
        short shortTwo = 32_767;
        int intOne = -2_000_000_000;
        int intTwo = 2_000_000_000;
        long longOne = -1_000_000_000_000L;
        long longTwo = 1_000_000_000_000L;

        System.out.println(byteOne + "\n" + byteTwo + "\n" + shortOne + "\n" + shortTwo + "\n" + intOne + "\n" + intTwo + "\n" + longOne + "\n" + longTwo);

        //с точкой
        float floatOne = 3.14F;
        double doubleOne = 123.123;

        System.out.println(floatOne + "\n" + doubleOne);

        //символ
        char oneChar = 'C';
        char twoChar = 65535;
        char threeChar = '\u03bc';

        //логический тип
        boolean oneBoolean = true;
        boolean twoBoolean = false;



    }

}
