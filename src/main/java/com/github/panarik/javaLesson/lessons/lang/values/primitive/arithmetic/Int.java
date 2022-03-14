package com.github.panarik.javaLesson.lessons.lang.values.primitive.arithmetic;

public class Int {

    private static float result;


    public static void main(String[] args) {

        //сложение, деление, умножение в методе. Вывод результата
        arithmeticCalc(10, 20, 30, 40);
        System.out.println("result = "+result);

        //умножение
        System.out.println(3 + 4 * (5 + 6 * 7));

        //деление с остатком
        int a = 10;
        int b = 3;
        System.out.println("Остаток от деления " + a + " и " + b + " = " + (a % b));

        //условие деления с остатком и без остатка
        ifLeapYear(1600);
    }

    private static float arithmeticCalc(float a, float b, float c, float d){
        result = a * (b + (c / d));
        return result;
    }

    public static void ifLeapYear(int year) {
        if ((year % 4 != 0) //не кратно 4
                & (year % 400 != 0) //не кратно 400
                || (year % 100 == 0) //кратно 100
        )
            System.out.println("год "+year+" - НЕ високосный");
        else
            System.out.println("год "+year+" - високосный");
    }

}
