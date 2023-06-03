package com.github.panarik.javaLesson.lessons.lang.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {

    private static String zeroOrOnce = "?"; // Zero or One. Make driver ungreedy. Trying to skip preceding token and check the next one.
    private static String oneOrMore = "+"; //  attempt to match the preceding token ONE times or MANY. Try so many as can first.
    private static String zeroOrMore = "*"; //  attempt to match the preceding token ZERO times or ONE or MANY. Try so many as can first.

    public static void main(String[] args) {

        matches("colou?r", "colour or color"); // [colour, color]
        matches("Nov(ember)?", "November or Nov"); // [November, Nov]
        matches("Nov(ember)??", "November or Nov"); // Lazy: [Nov, Nov]
        matches(".?", "some string -123.50 US"); // [s, o, m, e,  , s, t, r, i, n, g,  , -, 1, 2, 3, ., 5, 0,  , U, S, ]
        matches("[-]?", "some string -123.50 US"); // [, , , , , , , , , , , , -, , , , , , , , , , ]
        matches("[-]?[0-9]?", "some string -123.50 US"); // [, , , , , , , , , , , , -1, 2, 3, , 5, 0, , , , ]
        matches("([-])?([0-9])+", "some string -123.50 US"); // [-123, 50] Group at least one '-' and many as possible numbers.

        System.out.println("\n'+'");
        matches("\\d+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers."); // [1, 500, 100, 000, 10, 4, 0, 90]
        matches(".+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers."); // [string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers.]
        matches("[\\d.]+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers."); // [1, 500, 100, 000, 10.4, 0.90, .]
        matches("[1-9]+", "string with 1 or 5500 or 01100 000 or 10.4 or 0.90 numbers."); // [1, 55, 11, 1, 4, 9]
        matches("([0-9])\\1+", "string with 1 or 500 or 100 000 or 10.4 or 0.90 numbers."); // same numbers [00, 00, 000]

        System.out.println("\n'*'");
        matches("colou*r", "colour or color"); // [colour, color]
        matches("<abc>(.*?)<abc>", "<abc><abc> <abc>some text<abc>"); // [<abc><abc>, <abc>some text<abc>]

        System.out.println("\n'{}'");
        matches(".{4}", "1234567890 abcd"); // [1234, 5678, 90 a] - returns groups with four characters.
        matches("a{1}", "aaa"); //      входит в строку n раз
        matches("a{2,}", "aaa"); //     входит в строку n и более количество раз
        matches("a{1,3}", "aaa"); //    входит в строку от n до m раз
        matches("\\d{1,2} rings", "20 rings, 5 rings, 100 rings"); //    входит в строку от 1 до 2 раз

        // Combine
        System.out.println("\n'Combine'");
        matches("are (.+?),", "There are some string, is -123.50 US"); // un-greedy. Goes until ','

    }

    private static List<String> matches(String regex, String input) {
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
