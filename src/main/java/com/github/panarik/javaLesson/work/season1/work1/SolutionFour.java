package com.github.panarik.javaLesson.work.season1.work1;

public class SolutionFour {

    /*
    Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
    Вывести приветствие в консоль.
    */

    public static void main(String[] args) {
        printMessage("Вася");
    }

    private static void printMessage(String name) {
        System.out.println("Привет, "+name+"!");
    }



}
