package com.github.panarik.javaLesson.main;

public class WithMethodClass {


    public static void main(String[] args) {

        //получаем результат метода без ввода данных
        System.out.println("pi = " + pi());

        //ставим в параметр метода данные и получаем результат
        System.out.println(scr(5));

    }


    public static double pi() {
        return 3.14;
    }


    public static int scr(int a) { // в параметре создаём переменную
        return a*a; //выводим результат вычислений
    }



}
