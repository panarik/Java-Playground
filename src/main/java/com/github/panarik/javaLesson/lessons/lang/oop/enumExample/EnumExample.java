package com.github.panarik.javaLesson.lessons.lang.oop.enumExample;

public class EnumExample {

    public static void main(String[] args) {

        //создаём переменную которая будет содержать пятнцу
        WeekDay day = WeekDay.FRIDAY;
        WeekDayNumber dayNumber = WeekDayNumber.FRIDAY;
        System.out.println("Вызываем энам: " + day);

        //узнаём порядковый номер энама
        System.out.println("Номер энама: " + day.ordinal());

        //вызываем порядковый номер дня недели
        System.out.println("Номер дня недели: " + dayNumber.getDayNumber());

        //вызываем имя дня недели
        System.out.println("Имя дня недели: " + dayNumber.getDayName());

    }

}
