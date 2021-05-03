package com.github.panarik.javaLesson.season1.work2.task4;

public class Solution {

    /*
     *  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
     *  и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */

    public static void main(String[] args) {

        int[][] arr2D = new int[4][4];

        for (int i2 = 0; i2 < arr2D.length; i2++) {
            arr2D[i2][i2] = 1;
        }

        System.out.print(arr2D[0][0] + " " + arr2D[0][1] + " " + arr2D[0][2] + " " + arr2D[0][3] + "\n");
        System.out.print(arr2D[1][0] + " " + arr2D[1][1] + " " + arr2D[1][2] + " " + arr2D[1][3] + "\n");
        System.out.print(arr2D[2][0] + " " + arr2D[2][1] + " " + arr2D[2][2] + " " + arr2D[2][3] + "\n");
        System.out.print(arr2D[3][0] + " " + arr2D[3][1] + " " + arr2D[3][2] + " " + arr2D[3][3] + "\n");

    }

}
