package com.github.panarik.javaLesson.lessons.lang.regular;

import java.util.Scanner;

public class StringWhile {

    public static void main(String[] args) {
        String string = "1 sentence 2 sentence 3 sentence";

        Scanner scanner = new Scanner(string);

        while (scanner.hasNext()) {
            if (scanner.hasNext("sentence")) {
                System.out.println(scanner.next());
            }
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            } else scanner.next();
        }
    }

}
