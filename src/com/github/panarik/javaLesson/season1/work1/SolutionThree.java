package com.github.panarik.javaLesson.season1.work1;

public class SolutionThree {

    /*
    Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное.
    Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
     */

    public static void main(String[] args) {
        positiveOrNegative(0);
    }

    private static void positiveOrNegative(int i) {
        if (i >= 0)
            System.out.println("Поздравляю. Вы только что передали положительное число");
        else
            System.out.println("Поздравляю. Вы только что передали отрицательное число");

    }

}
