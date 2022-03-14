package com.github.panarik.javaLesson.lessons.lang.operator.operatorWhile;

import java.util.Scanner;

public class WhileInfinite {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ваша задача угадать число.");

        //по каждому шагу цикла запускаем метод с очередным уровнем игры:
        // - загадыванием числа
        // - проверкой введённого ответа
        for (int i = 10; i <= 30; i = i + 10) playLevel(i);

        System.out.println("Вы выиграли!!!");
        scanner.close(); //в конце игры освобождаем ресурсы взятые сканнером
    }

    private static void playLevel(int range) {

        int number = (int) (Math.random() //В начале уровня создаём загаданное число. присваиваем переменной number случайное число от 0 до 1
                * range);//помноженное на i, тоесть берем из текущего значения в цикле

        while (true) { //запускаем цикл while (бесконечный т.к. в параметре всегда TRUE)
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt(); //пользователь вводит число в переменную input_number

            if (input_number == number) {
                System.out.println("Вы угадали! Загадано число " + number + " !!!");
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
