package com.github.panarik.javaLesson.lessons.lang.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleScanner {

    public static void main(String[] args) {
        scanSystemIn();
        scanFile();
        scanWithDelimiters();
    }

    private static void scanWithDelimiters() {
        String input = "1 fish 2 fish red fish blue fish";
        Scanner scanner = new Scanner(input).useDelimiter("\\s*fish\\s*");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) System.out.println(scanner.nextInt()); //get next int
            if (scanner.hasNext()) System.out.println(scanner.next()); //get next string
        }
    }

    private static void scanSystemIn() {
        // scan System.in
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a = " + a);
    }

    private static void scanFile() {
        // scan file
        Scanner sc = null;
        try {
            sc = new Scanner(new File("myNumbers"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLong()) {
            long aLong = sc.nextLong();
        }
    }

}
