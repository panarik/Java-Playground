package com.github.panarik.javaLesson.lessons.lang.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Shorthand regex characters.
 */
public class Predefined {

    private static String digit = "\\d = [0-9]"; // any digit
    private static String notDigit = "\\D = [^0-9]"; // not a digit
    private static String space = "\\s = [ \\n\\r\\t\\f]"; // regular space, newline, carriage return, tab, and formfeed
    private static String notSpace = "\\S = [^\\s]"; // any character except space, newline, carriage return, tab, and formfeed
    private static String word = "\\w"; // word character: a-z A-Z 0-9 _
    private static String notWord = "\\W"; // not a word character: a-z A-Z 0-9 _

    private static String corner = "\\b"; // corner of word
    private static String notCorner = "\\B"; // not a corner of word
    private static String newLine = "\\n"; // new line
    private static String newLine2 = "\\r"; // new line
    private static String tab = "\\t"; // TAB character
    private static String endOfFile = "\\f"; // end of file

    public static void main(String[] args) {
        matches("\\d", "107.255.255.100");
        matches("\\D", "107.255.255.100");

        matches("\\s", "Java Tutorials\n");
        matches("\\S", "Java Tutorials\n");

        matches("\\w", "Page_no: 137");
        matches("\\W", "Page_no: 137");

        matches("e\\b", "there some bit a code");
        matches("e\\B", "there some bit a code");
    }

    private static void matches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex); // compile regex
        Matcher matcher = pattern.matcher(input); // get matchers with current input
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group()); // add matchers to list
        }
        System.out.println("Regex '" + regex + "' string '" + input + "': " + matches);
    }

}
