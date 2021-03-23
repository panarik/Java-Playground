package com.github.panarik.javaLesson.work4.task1;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Solution {

    /*
     * 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
     * 2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
     */

    private static final Random RANDOM = new Random(); //ввод AI случайного поля
    private static final Scanner SCANNER = new Scanner(System.in); //ввод пользователем данных
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static boolean gameRepead = true;
    private static String human;
    private static int scoreHuman = 0;
    private static int scoreAI = 0;

    private static char[][] field; //игровое поле
    private static final int fieldSizeX = 3; //длина поля
    private static final int fieldSizeY = 3; //ширина поля


    public static void main(String[] args) {

        System.out.print("Введите своё имя >>>>>");
        human = SCANNER.nextLine();
        System.out.println("Ок," + human + " готовься проигрывать.");


        while (gameRepead) { //цикл создания поля и игры
            initField(fieldSizeY, fieldSizeX); //создаём игровое поле
            printField(); //выводим игровое поле на экран

            while (true) { // цикл игры
                turnHuman(); //ход игрока
                printField();
                if (checkGame()) break;
                turnAI(); //ход AI
                printField();
                if (checkGame()) break;


            }

            System.out.print("Хотите повторить? Нажмите Y или N >>>>>>");
            String s = SCANNER.next().toLowerCase(Locale.ROOT);
            gameRepead = false; //сбрасываем счетчик игры
            if (s.equals("y")) gameRepead = true;
        }
    }


    private static void initField(int fieldSizeY, int fieldSizeX) {
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY; //заполняем всё игровое поле
            }
        }
    }


    private static void printField() {
        System.out.println("     1    2    3  ");
        System.out.println("   ---------------");
        //выводим поля по вертикали
        for (int y = 0; y < fieldSizeY; y++) {
            //выводим поля по горизонтали
            System.out.print((y + 1) + "- ");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print("| " + field[y][x] + " |"); //выводим на поле актуальное сожержимое массива
            }
            System.out.println();
        }
        System.out.println("   ---------------");
    }


    private static void turnHuman() {
        int x;
        int y;
        do {
            System.out.print("Введите координаты X и Y через пробел >>>>>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;

        } while (!isCellInField(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN; //валидируем ввод
    }


    private static void turnAI() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI; //валидируем ввод
    }


    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY; //ячейка пустая
    }


    private static boolean isCellInField(int x, int y) {
        return x >= 0 && x < field.length && y >= 0 && y < field.length; //ввод в границах поля
    }


    private static boolean checkGame() {
        if (checkWin(DOT_HUMAN)) {
            System.out.println("Странно, " + human + " выиграл!");
            scoreHuman++;
            System.out.println("Счет:\n" + human + " - " + scoreHuman + "\nAI - " + scoreAI);
            return true;
        }
        if (checkWin(DOT_AI))
            if (checkNobodyWin()) {
                System.out.println("AI выиграл!");
                scoreAI++;
                System.out.println("Счет:\n" + human + " - " + scoreHuman + "\nAI - " + scoreAI);
                return true;
            }
        return false;
    }


    private static boolean checkWin(char dot) {
        //по горизонтали
        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
        //по вертикали
        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
        //по диагонали
        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;

        return false;
    }


    //проверка, что никто не выиграл (все поля заполнены)
    private static boolean checkNobodyWin() {
        for (int y = 0; y < field.length; y++) {
            for (int x = 0; x < field.length; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
