package com.github.panarik.javaLesson.lang.algorithms.recursion;

public class RecursionExapmle {

    public static void main(String[] args) {
        //recursion();
        sumFor();
    }

    private static int sum(int a, int b) {
        return a+b;
    }

    // Сложение методом for()
    private static void sumFor() {
        int[] array = {2, 4, 6};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("result: " + sum);
    }

    //Бесконечная рекурсия.
    private static void recursion() {
        for (int i = 0; i < 10; i++) {
            if (true) {
                System.out.println("start new recursion");
                recursion();
            }
        }
    }

}
