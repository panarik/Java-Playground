package com.github.panarik.javaLesson.lang.method;

public class CallMethod {


    public static void main(String[] args) {

        //получаем результат метода без ввода данных
        System.out.println("pi = " + pi());

        //ставим в параметр метода данные и получаем результат
        System.out.println(scr(5));


        //Вызываем метод передавая ему в качестве параметра строку
        string("Java is easy to learn!");
        string("Java is object-oriented!");
        string("Java is platform-independent!");

        //вызываем метод c внутренней логикой и выводом результата на экран
        printLength(5);

        //Выводим в методе имя
        printName("Афанасий");
    }


    public static double pi() {
        return 3.14;
    }

    public static int scr(int a) { // в параметре создаём переменную
        return a*a; //выводим результат вычислений
    }

    public static void string (String text) {

        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }

    public static void printLength(int radius){

        double pi = 3.14;
        double l = 2 * pi * radius;
        System.out.println("При радиусе = "+radius+", длина окружности = "+l);
    }

    public static void printName(String name) {
        System.out.println("Привет, "+name+"!");
    }





}
