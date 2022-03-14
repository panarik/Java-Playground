package com.github.panarik.javaLesson.season1.work1;

public class SolutionTwo {

    /*
    Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    - если да – вернуть true,
    - в противном случае – false;
     */

    public static void main(String[] args) {
        System.out.println(if10to20(5, 5));
    }

    private static boolean if10to20(int a, int b) {
        boolean result = (a + b >= 10) & (a + b <= 20);
        return result;
    }
}
