package com.github.panarik.javaLesson.scanner;

import java.util.Scanner;

public class IfScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        int operator = scanner.nextInt();

        System.out.println("\nВведите первое число...");
        int a = scanner.nextInt();

        System.out.println("\nВведите первое число...");
        int b = scanner.nextInt();

        int result = 0;
        if (operator == 1)
            result = a + b;
        else if (operator == 2)
            result = a - b;
        else if (operator == 3)
            result = a * b;
        else
            System.out.println("Данный вариант не обрабатывается.");

        System.out.println("result = "+result);



    }


}
