package com.github.panarik.javaLesson.operator.operatorWhile;

public class DoWhile {

    public static void main(String[] args) {
        int number = 3; //число возводимое в степень
        int result = number; //результат возведения в степень
        int power = 1; //Начальный показатель степени

        do {
            System.out.println("число " + number + " в степени "+ power + " = "+result);
            power++;
            result = result *number;
        } while (result<10000);
    }

}
