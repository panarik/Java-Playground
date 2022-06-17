package com.github.panarik.javaLesson.lessons.lang.regex;

import java.util.Scanner;

public class ByScanner {

    public static void main(String[] args) {

        useWhile();
//        useDelimiter();

    }

    private static void useDelimiter() {
        String s = "Java 1 Java 2 Java 3";
        Scanner scanner = new Scanner(s).useDelimiter("\\s*Java\\s*"); // Java with spaces
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }
    }

    private static void useWhile() {
        String string = "1 sentence 2 sentence 3 sentence";

        Scanner scanner = new Scanner(string);

        while (scanner.hasNext()) {
            if (scanner.hasNext("sentence")) { // having regular
                System.out.println(scanner.next());
            } else if (scanner.hasNextInt()) { // having int
                System.out.println(scanner.nextInt());
            } else scanner.next();// other
        }
    }

}
