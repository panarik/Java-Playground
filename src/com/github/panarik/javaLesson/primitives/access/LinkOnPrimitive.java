package com.github.panarik.javaLesson.primitives.access;

public class LinkOnPrimitive {

    public static void main(String[] args) {

        int m = 5;
        int n = 6;

        //Выводим значения переменных
        System.out.println("m = "+m);
        System.out.println("n = "+n);

        //пытаемся поменять значения пемеменных местами
        swap(m, n);

        //выводим повторно значения переменных
        System.out.println("m = "+m);
        System.out.println("n = "+n);



    }

    private static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;

    }

}
