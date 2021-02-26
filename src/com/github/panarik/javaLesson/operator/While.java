package com.github.panarik.javaLesson.operator;

import java.util.Scanner;

public class While {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число.");

        //1-ый уровень
        int range = 10; //диапазон значений для угадывания в игре
        int number = (int) (Math.random() //Загаданное число. присваиваем переменной number случайное число от 0 до 1
                * range);//помноженное на 10, тоесть уже от 0 до 10
        playLevel(range, number);
        scanner.close(); //освобождаем ресурсы взятые сканнером
    }

    private static void playLevel(int range, int number) {

        while (true) { //запускаем цикл while (бесконечный т.к. в параметре всегда TRUE)
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt(); //пользователь вводит число в переменную input_number

            if (input_number == number) {
                System.out.println("Вы угадали! Загадано число "+number+" !!!");
                break; //только после правильного ответа цикл завершается
            } else if (input_number < number & input_number * 2 >= number) {
                System.out.println("Неправильно. Загаданное число немного больше.");
            } else if (input_number * 2 < number) {
                System.out.println("Неправильно. Загаданное число гораздо больше.");
            } else if (input_number > number & input_number / 2 <= number) {
                System.out.println("Неправильно. Загаданное немного меньше.");
            } else if (input_number / 2 > number) {
                System.out.println("Неправильно. Загаданное гораздо меньше.");
            }
        }

    }

}
