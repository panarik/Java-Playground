package com.github.panarik.javaLesson.lessons.lang.values.primitive;

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


        //логический тип
        boolean oneBoolean = true;
        boolean twoBoolean = false;

        //Преобразование
        byte b1 = 100;
        int i1= b1;

        int i2 = 10000;
        byte b2 = (byte) i2;






    }

}
