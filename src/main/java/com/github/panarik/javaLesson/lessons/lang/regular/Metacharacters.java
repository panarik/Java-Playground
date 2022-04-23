package com.github.panarik.javaLesson.lessons.lang.regular;

import java.util.regex.Pattern;

public class Metacharacters {

    private static String escape = "\\."; // escape metacharacter (here escape dots)
    private static String corner = "\\b"; // corner of word
    private static String notCorner = "\\B"; // not a corner of word
    private static String newLine = "\\n"; // new line
    private static String newLine2 = "\\r"; // new line
    private static String tab = "\\t"; // TAB character
    private static String endOfFile = "\\f"; // end of file
    private static String digit = "\\d"; // any digit
    private static String notDigit = "\\D"; // not a digit
    private static String word = "\\w"; // word character: a-z A-Z 0-9 _
    private static String notWord = "\\W"; // not a word character: a-z A-Z 0-9 _
    private static String space = "\\s"; // space character
    private static String spaces = "\\s*"; // spaces character
    private static String notSpace = "\\S"; // not a space character

    public static void main(String[] args) {
        System.out.println(matches("regex.com", "regex.com"));
    }

    private static boolean matches(String line, String regex) {
        return Pattern.matches(line, regex);
    }

}
