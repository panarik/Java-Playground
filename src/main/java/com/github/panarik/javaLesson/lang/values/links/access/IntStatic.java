package com.github.panarik.javaLesson.lang.values.links.access;

public class IntStatic {

    //объявляем статик переменную. Она юзается на все методы класса
    private static int i = 0;

    public static void main(String[] args) {
        someMethod(10);
        System.out.println("i = "+i);
    }

    public static void someMethod(int i) {
        //присваиваем входящее значение в статик переменную класса
        IntStatic.i = i;
    }



}
