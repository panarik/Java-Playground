package com.github.panarik.javaLesson.work4.task1;

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

    private static char[][] field; //игровое поле
    private static final int fieldSizeX = 3; //длина поля
    private static final int fieldSizeY = 3; //ширина поля


    public static void main(String[] args) {

        initField(fieldSizeY, fieldSizeX); //создаём игровое поле
        printField(); //выводим игровое поле на экран

        while (true) {
            turnHuman(); //ход игрока
            printField();
            if (checkWin(DOT_HUMAN)) { //проверка выигрыша игроком
                System.out.println("Игрок выиграл!");
                break;
            } else if (checkNobodyWin()) {
                System.out.println("Ничья.");
                break;
            }

            turnAI(); //ход AI
            printField();
            if (checkWin(DOT_AI)) { //проверка выигрыша AI
                System.out.println("AI выиграл!");
                break;
            } else if (checkNobodyWin()) {
                System.out.println("Ничья.");
                break;
            }
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


    private static boolean checkWin(char dotHuman) {
        //по горизонтали
        if (field[0][0] == dotHuman && field[0][1] == dotHuman && field[0][2] == dotHuman) return true;
        if (field[1][0] == dotHuman && field[1][1] == dotHuman && field[1][2] == dotHuman) return true;
        if (field[2][0] == dotHuman && field[2][1] == dotHuman && field[2][2] == dotHuman) return true;
        //по вертикали
        if (field[0][0] == dotHuman && field[1][0] == dotHuman && field[2][0] == dotHuman) return true;
        if (field[0][1] == dotHuman && field[1][1] == dotHuman && field[2][1] == dotHuman) return true;
        if (field[0][2] == dotHuman && field[1][2] == dotHuman && field[2][2] == dotHuman) return true;
        //по диагонали
        if (field[0][0] == dotHuman && field[1][1] == dotHuman && field[2][2] == dotHuman) return true;
        if (field[0][2] == dotHuman && field[1][1] == dotHuman && field[2][0] == dotHuman) return true;

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
