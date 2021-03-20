package com.github.panarik.javaLesson.work3.task1;

import java.util.Scanner;

public class Solution {

    /*
     * 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
     * При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
     * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */

    private static Scanner scanner = new Scanner(System.in);
    //конфиг игры
    private static boolean gameStart = true; //играем или нет
    private static int range = 9; // загадываем число от 0 до 9
    private static boolean gameWin = false; //игра выиграна или нет


    public static void main(String[] args) {

        gamePlay();


        //после окончания игры
        if (gameWin == true) {
            System.out.println("Вы выиграли :)");
        } else System.out.println("Вы проиграли :(");

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int input_number_again = scanner.nextInt();
        scanner.close(); //в конце игры освобождаем ресурсы взятые сканнером
    }


    private static void gamePlay() {
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
                        gameWin = false;
                    } else if (input_number * 2 < number) {
                        System.out.println("Неправильно. Загаданное число гораздо больше.");
                        gameWin = false;
                    } else if (input_number > number & input_number / 2 <= number) {
                        System.out.println("Неправильно. Загаданное немного меньше.");
                        gameWin = false;
                    } else if (input_number / 2 > number) {
                        System.out.println("Неправильно. Загаданное гораздо меньше.");
                        gameWin = false;
                    }
                }
                gameStart = false;

            }
        }

    }

}
