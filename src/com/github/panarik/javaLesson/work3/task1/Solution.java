package com.github.panarik.javaLesson.work3.task1;

import java.util.Scanner;

public class Solution {

    /*
     * 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //конфиг игры
        boolean gameStart = true; //играем или нет
        int range = 9; // загадываем число от 0 до 9
        boolean gameWin = false; //игра выиграна или нет

        //управление игрой
        while (gameStart) {
            if (gameStart = true) {
                System.out.println("Ваша задача угадать число от 0 до " + range);
                int number = (int) (Math.random() * range);

                //три попытки
                for (int i = 1; i <= 3; i++) {

                    System.out.println("Попытка № " + (i) + " из 3-х");
                    int input_number = scanner.nextInt(); //пользователь вводит число в переменную input_number

                    if (input_number == number) {
                        System.out.println("Вы угадали! Загадано число " + number + " !!!");
                        gameStart = false;
                        gameWin = true;
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
                gameStart = false;
                gameWin = false;

            }
        }

        //после окончания игры
        if (gameWin == true) {
            System.out.println("Вы выиграли :)");
        } else System.out.println("Вы проиграли :(");


        scanner.close(); //в конце игры освобождаем ресурсы взятые сканнером
    }

    private static void playLevel(int range) {


        while (true) { //запускаем цикл while (бесконечный т.к. в параметре всегда TRUE)


        }

    }

}
