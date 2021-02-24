package com.github.panarik.javaLesson.scanner;

import java.util.Scanner;

public class SimpleScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner( //создаём новый объект класса Scanner
                System.in // в параметре переменная класса InputStream для сохранения введенного пользователем значения
        );
        int a = scanner //присваиваем переменной "a" значение поля ссылки на объект Scanner()
                .nextInt(); //и этим int полем является вывод метода nextInt()

        System.out.println("a = "+a);

    }

}
