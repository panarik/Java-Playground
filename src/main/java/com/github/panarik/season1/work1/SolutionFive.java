package com.github.panarik.javaLesson.season1.work1;

public class SolutionFive {

    /*
     *Написать метод, который определяет является ли год високосным.
     *Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     *Для проверки работы вывести результаты работы метода в консоль
     */

    public static void main(String[] args) {

        ifLeapYear(1);

    }

    public static void ifLeapYear(int year) {
        if ((year % 4 != 0) //не кратно 4
                & // и
                (year % 400 != 0) //не кратно 400
                || //или
                (year % 100 == 0) //кратно 100
        )
            System.out.println("год " + year + " - НЕ високосный");
        else
            System.out.println("год " + year + " - високосный");
    }

}
