package com.github.panarik.javaLesson.lessons.algorithms.recursion;

public class RecursionExapmle {

    public static void main(String[] args) {
//        recursionInfinite();
//        recursionSimple(5); // 5 steps recursion
        System.out.println(sumRecursion(123));
    }

    private static void recursionSimple(int i) {
        if (i <= 0) {
            System.out.println("Done!");
            return;
        } else {
            System.out.println("Remaining:" + i);
            i--;
            recursionSimple(i);
        }
    }

    // Сложение методом рекурсии
    private static int sumRecursion(int digits) {
        if (digits <= 0) return 0; // Exit from method if it contains nothing.
        int temp = digits % 10; // Give the last digit.
        int otherDigits = sumRecursion(digits / 10);
        int result = temp + otherDigits; // Return one digit from stack plus another from method.
        return result;
    }

    //Бесконечная рекурсия.
    private static void recursionInfinite() {
        System.out.println("start new recursion");
        recursionInfinite();
    }

}
