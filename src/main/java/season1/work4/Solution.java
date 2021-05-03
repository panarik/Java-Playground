package com.github.panarik.javaLesson.season1.work4;

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

    //config
    private static char[][] field; //игровое поле
    private static final int fieldSizeX = 3; //длина поля
    private static final int fieldSizeY = 3; //ширина поля
    private static final int lengthWin = 3; //длина выигрышной линии


    public static void main(String[] args) {

        System.out.print("Введите своё имя >>>>>");
        human = SCANNER.nextLine();
        System.out.println("Ок," + human + " готовься проигрывать.");


        while (gameRepead) { //цикл создания поля и игры
            initField(fieldSizeY, fieldSizeX); //создаём игровое поле
            printField(); //выводим игровое поле на экран

            while (true) { // цикл игры
                turnHuman(); //ход игрока
                if (checkGame()) break; //проверяем кто выиграл или ничья
                turnAI(); //ход AI
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

    //ход игрока
    private static void turnHuman() {
        int x;
        int y;
        do {
            System.out.print("Введите координаты X и Y через пробел >>>>>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;

        } while (!isCellInField(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_HUMAN; //валидируем ввод

        printField(); //обновляем поле

    }

    //ход AI
    private static void turnAI() {
        if (scanField(DOT_AI, lengthWin)) {
            printField();
            return;
        }
        if (scanField(DOT_HUMAN, lengthWin)) {
            printField();
            return;
        }
        if (scanField(DOT_AI, lengthWin - 1)) {
            printField();
            return;
        }
        if (scanField(DOT_HUMAN, lengthWin - 1)) {
            printField();
            return;
        }
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[y][x] = DOT_AI; //валидируем ввод
        printField();
    }

    //проверка на возможный выигрыш
    private static boolean scanField(char dot, int lengthWin) {

        for (int x = 0; x < lengthWin; x++) {
            for (int y = 0; y < lengthWin; y++) {
                if (isCellEmpty(x, y)) { //проверяем только пустые ячейки
                    field[y][x] = dot; //ставим в эту пустую ячейку фишку
                    if (checkWin(dot, lengthWin)) { // и если при этом будет выйгрыш
                        if (dot == DOT_AI) { //если выигрыш AI
                            return true; //фишка остаётся, проверка окончена
                        }
                        if (dot == DOT_HUMAN) { //если выигрыш игрока
                            field[y][x] = DOT_AI; //ставим на это место фишку AI, чтобы заблочить победу игрока
                            return true; //фишка поставлена, проверка окончена
                        }
                    }
                    field[y][x] = DOT_EMPTY; //если нвыигрыша нет, то убираем проверочную фишку с ячейки
                }
            }
        }
        return false;
    }

    private static boolean isCellEmpty(int x, int y) {
        return field[y][x] == DOT_EMPTY; //ячейка пустая
    }

    private static boolean isCellInField(int x, int y) {
        return x >= 0 && x < field.length && y >= 0 && y < field.length; //ввод в границах поля
    }

    //вывод сообщения при выигрыше и остановка игры
    private static boolean checkGame() {
        if (checkWin(DOT_HUMAN, lengthWin)) { //проверка выигрыша Игрока
            System.out.println("Странно, " + human + " выиграл!");
            scoreHuman++;
            System.out.println("Счет:\n" + human + " - " + scoreHuman + "\nAI - " + scoreAI);
            return true;
        }
        if (checkWin(DOT_AI, lengthWin)) { //проверка выигрыша AI
            System.out.println("AI выиграл!");
            scoreAI++;
            System.out.println("Счет:\n" + human + " - " + scoreHuman + "\nAI - " + scoreAI);
            return true;
        }

        if (checkNobodyWin()) {
            System.out.println("Ничья!");
            System.out.println("Счет:\n" + human + " - " + scoreHuman + "\nAI - " + scoreAI);
        }
        return false;
    }

    //проверка различных направлений выигрышных линий из каждой начальной точки на поле
    private static boolean checkWin(char dot, int lengthWin) {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (checkLine(dot, x, y, 1, 0, lengthWin)) return true; //проверка горизонтали +X
                if (checkLine(dot, x, y, 0, 1, lengthWin)) return true; //проверка вертикали +Y
                if (checkLine(dot, x, y, 1, 1, lengthWin)) return true; //проверка диагонали +X +Y
                if (checkLine(dot, x, y, 1, -1, lengthWin)) return true; //проверка диагонали +X -Y
            }
        }
        return false;
    }

    //проверка выигрышной линии из конкретной точки
    private static boolean checkLine(char dot, int x, int y, int incrementX, int incrementY, int lengthWin) {
        //2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
        // например, с использованием циклов
        int endLineX = x + (lengthWin - 1) * incrementX; //конец проверяемой линии по оси Х
        int endLineY = y + (lengthWin - 1) * incrementY; //конец проверяемой линии по оси Y
        if (!isCellInField(endLineX, endLineY)) return false;
        for (int i = 0; i < lengthWin; i++) {
            if (field[y + i * incrementY][x + i * incrementX] != dot)
                return false; //если хоть в одном месте проверяемой линии нет текущего знака, то выигрыша нет
        }
        return true; //если проход был выполнен до конца, то выигрыш есть
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
