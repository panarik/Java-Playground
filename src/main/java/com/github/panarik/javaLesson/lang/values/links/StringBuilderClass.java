package com.github.panarik.javaLesson.lang.values.links;

public class StringBuilderClass {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("!Hello");

        // Добавление, вставка.
        builder.append(" World"); //добавляем 'String'
        builder.append('!'); //добавляем 'char'
        builder.insert(0, "Insert "); //вставляем строку
        builder.insert(0, '+'); //вставляем символ

        // Удаление.
        builder.deleteCharAt(0); //удаляем первый символ
        builder.delete(0, 1); //удаляем символы с первого (включительно) по второй (не включительно)

        // Вывод.
        System.out.println(builder); //выводим строку
        System.out.println(builder.indexOf("W")); //выводим индекс символа
        System.out.println(builder.reverse()); //разворачиваем строку
    }
}
