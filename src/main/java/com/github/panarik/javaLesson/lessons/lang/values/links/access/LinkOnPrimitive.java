package com.github.panarik.javaLesson.lessons.lang.values.links.access;

public class LinkOnPrimitive {

    public static void main(String[] args) {

        int m = 5;
        int n = 6;

        //Выводим значения переменных
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        //пытаемся поменять значения пемеменных местами
        swap(m, n);

        //выводим повторно значения переменных
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        //конкотенация. Если одной строкой то все int преобразуются в строку
        System.out.println("2 + 1 = " + 1 + 2);

        //Конкотенация. Если в скобках, то сначала выполняем сложение
        System.out.println("2 + 1 = " + (1 + 2));


    }

    private static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;

    }

}
