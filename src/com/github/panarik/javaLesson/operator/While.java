package com.github.panarik.javaLesson.operator;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число.");
        Scanner scanner = new Scanner(System.in);

        int range = 10;
        int number = (int) (Math.random() //Загаданное число. присваиваем переменной number случайное число от 0 до 1
                * range //помноженное на 10, тоесть уже от 0 до 10
        );

        while (true) { //запускаем цикл while (бесконечный т.к. в параметре всегда TRUE)

            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt(); //пользователь вводит число в переменную input_number

            if (input_number == number) {
                System.out.println("Вы угадали! Загадано число "+number+" !!!");
                break; //только после правильного ответа цикл завершается
            } else if (input_number < number & input_number * 2 > number) {
                System.out.println("Неправильно. Загаданное число гораздо больше.");
            } else if (input_number * 2 < number) {
                System.out.println("Неправильно. Загаданное число намного больше.");
            } else if (input_number > number & input_number / 2 <= number) {
                System.out.println("Неправильно. Загаданное немного меньше.");
            } else if (input_number / 2 > number) {
                System.out.println("Неправильно. Загаданное гораздо меньше.");
            }
        }

        scanner.close(); //освобождаем ресурсы взятые сканнером

    }

}
