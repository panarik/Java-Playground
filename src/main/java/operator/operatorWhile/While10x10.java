package com.github.panarik.javaLesson.operator.operatorWhile;

public class While10x10 {

    public static void main(String[] args) {

        int levelNumber = 1; //строка в таблице
        int levelInit = 1; //первое число в первой строке
        int levelEach = 1; //первое число в каждой строке

        while (levelNumber <= 10) {

            for (int i = 1; i<=10; i++){
                System.out.print(levelEach + " ");
                levelEach= levelNumber+levelEach;
            }

            System.out.println("");
            levelEach = levelNumber+1;
            levelNumber++;
        }
    }

}
