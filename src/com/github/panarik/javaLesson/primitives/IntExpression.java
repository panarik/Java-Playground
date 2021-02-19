package com.github.panarik.javaLesson.primitives;

public class IntExpression {

    public static void main(String[] args) {

        System.out.println(years(1000));
    }

    public static int years(int maxYear) {


        System.out.println("\nШаг 1. Считаем руками количество нескольких високосных годов, проверяем формулу.");
        //макс 1 год
        int endYear1 = 1;
        int quantity1 = endYear1/4;
        System.out.println("Если до 1-го года, то количество високосных лет = "+quantity1);
        //макс 4 года
        int endYear4 = 4; //максимальный год, до которого считаем високосные
        int quantity4 = endYear4 / 4;  // если years = 4
        System.out.println("Если до 4-го года, то количество високосных лет = "+quantity4);
        //макс 8 лет
        int endYear8 = 8;
        int quantity8 = endYear8 /4; //если years = 8
        System.out.println("Если до 8-го года, то количество високосных лет = "+quantity8);
        //макс 64 года
        int endYear64 = 64;
        int quantity64 = endYear64/4; //если years = 64
        System.out.println("Если до 64-го года, то количество високосных лет = "+quantity64);

        System.out.println("\nШаг 2. Вычитаем из проверенных результатов количества кратные 100.");
        System.out.println("Шаг 2.1. Пример (1год) формулы вычитания годов кратных 100");
        int quantity100 = endYear1/100;
        System.out.println("Шаг 2.1. Если сейчас 1-ый год, то количество лет кратных 100 = "+quantity100);
        int quantity1_minus_quantity100 = quantity1 - quantity100;
        System.out.println("Шаг 2.1. Если сейчас 1-ый год, то количество високосных лет минус количетсво лет кратных 100 = "+quantity1_minus_quantity100);

        System.out.println("Шаг 2.2. Пример (64год) формулы вычитания годов кратных 100");
        quantity100 = endYear64/100;
        System.out.println("Шаг 2.2. Если сейчас 64-ый год, то количество лет кратных 100 = "+quantity100);
        int quantity64_minus_quantity100 = quantity1 - quantity100;
        System.out.println("Шаг 2.2. Если до 64-го года, то количество високосных лет минус количетсво лет кратных 100 = "+quantity64_minus_quantity100);



        //ИТОГО:
        maxYear = (maxYear/4)-(maxYear/100)+(maxYear/400);

        return maxYear;
    }


}


