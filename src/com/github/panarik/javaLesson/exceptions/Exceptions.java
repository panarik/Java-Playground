package com.github.panarik.javaLesson.exceptions;

import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {
        divByZero();
        System.out.println("Выполнение программы после обработки эксепшена");
    }

    private static void divByZero() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
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
    }

}
