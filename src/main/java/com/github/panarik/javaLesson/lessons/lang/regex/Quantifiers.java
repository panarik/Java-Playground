package com.github.panarik.javaLesson.lessons.lang.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

    private static String zeroOrOnce = "?"; // Make driver ungreedy. Trying to skip preceding token and check the next one.
    private static String oneOrMore = "+"; //  attempt to match the preceding token ONE times or MANY. Try so many as can first.
    private static String zeroOrMore = "*"; //  attempt to match the preceding token ZERO times or ONE or MANY. Try so many as can first.

    public static void main(String[] args) {

        // '?'
        returnMatches("colou?r", "colour or color");
        returnMatches("Nov(ember)?", "November or Nov"); // [November, Nov]
        returnMatches("Nov(ember)??", "November or Nov"); // Lazy: [Nov, Nov]
        returnMatches(".?", "some string -123.50 US");
        returnMatches("[-]?", "some string -123.50 US");
        returnMatches("[-]?[0-9]?", "some string -123.50 US");

        // '+'
        returnMatches("\\d+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers.");
        returnMatches(".+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers.");
        returnMatches("[\\d.]+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers.");
        returnMatches("[0-9]+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers.");
        returnMatches("([0-9])\\1+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers."); // same numbers

        // '*'
        System.out.println("\n'*'");
        returnMatches("colou*r", "colour or color");
        returnMatches("<abc>(.*?)<abc>", "<abc><abc>");

        // '{}'
        returnMatches("{1}", "aaa"); //      входит в строку n раз
        returnMatches("{1,}", "aaa"); //     входит в строку n и более количество раз
        returnMatches("{1,3}", "aaa"); //    входит в строку от n до m раз

        // Combine
        returnMatches("are (.+?),", "There are some string, is -123.50 US"); // un-greedy. Goes until ','

    }

    private static List<String> returnMatches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex); // compile regex
        Matcher matcher = pattern.matcher(input); // get matchers with current input
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group()); // add matchers to list
        }
        System.out.println("Regex '" + regex + "' string '" + input + "': " + matches);
        return matches;
    }

    private static String getFirstIndex(String regex, String input) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        if (m.find()) {
            System.out.println("Get first matches with '" + regex + "': '" + m.group(0) + "'.");
            return m.group(0);
        } else return "No match found";
    }

}
