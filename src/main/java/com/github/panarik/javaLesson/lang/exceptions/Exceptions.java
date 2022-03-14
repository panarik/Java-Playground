package com.github.panarik.javaLesson.lang.exceptions;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        divRuntimeException();
        divByZero();
        divMyException();
    }

    private static void divRuntimeException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите любое число (0 - ошибка) --->");
        int i = scanner.nextInt();
        if (i==0) throw new RuntimeException("My Message in RuntimeException");
        else System.out.println("Выполнение программы");
    }

    private static void divByZero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число деления --->");
        int a = scanner.nextInt();
        System.out.print("Введите второе число деления --->");
        int b = scanner.nextInt();
        //пробуем выполнить код
        try {
            System.out.println(a / b);
        }
        //первый раз ловим эксепшен
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Сообщение: Нельзя разделить на ноль и возвращать ноль в объекте");
            System.out.println("Сообщение эксепшена: "+e.getMessage());
            System.out.println("Эксепшен полностью: "+e);
            //просто выдаем эксепшен
            e.printStackTrace();
        }
        //второй раз ловим эксепшен
        catch (RuntimeException r) {
            System.out.println("Что-то вообще непонятное сломалось");
        }
        //выполняем в любом случае
        finally {
            System.out.println("В любом случае закрываем какие-то ресурсы.");
        }
        System.out.println("Выполнение программы после обработки эксепшена");
    }

    private static void divMyException() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите любое число (0 - ошибка) --->");
        int i = scanner.nextInt();
        if (i==0) {
            System.out.println("Выкидываем эксепшен");
            throw new MyException("Some message");
        }
        else System.out.println("Выполнение программы");
    }

}
