package com.github.panarik.javaLesson.lessons.lang.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Regex metacharacters.
 */
public class Metacharacters {

    private static String any = "."; // Wildcard for any character.
    private static String escape1 = "\\"; // Escape character '\'. Will ignore any other metacharacters.
    private static String escape2 = "\\Q...\\E"; // Escape expression will ignore any other metacharacters with range '...'.
    private static String withRange = "[...]"; // One character with range inside [...].  Example: [a9]  - only 'a' and '9'. [0-9] - all from '0' to '9'.
    private static String withoutRange = "[^...]"; //  any character except inside [...]. Example: [^a0] - any except 'a' and '0'.
    private static String first = "^"; // First characters in the line.
    private static String last = "$"; // Last characters in the line.
    private static String or = "|"; // the pipe using for 'or' expressions.
    private static String parentheses = "(...)"; // Combine several expressions.
    private static String combineInsensitive = "(?i)()"; // Combine example: (?i)(the) - 'the' will be case insensitive.

    public static void main(String[] abc) {
        dotsExamples();
        slashEx();
        bracketEx();
        lookahead();
        lookBehind();
        parentheses();

        // First character '^'
//        returnMatches("^", "Java Tutorials");

        // '|'
//        returnMatches("1|5", "1 2 3 4 5 6 7 8 9");
    }

    /**
     * Parentheses for Grouping and Capturing.
     */
    private static void parentheses() {
        // '()'
        returnMatches("Set(Value)?", "Set SetValue Value");
        returnMatches("Set(Value)??", "Set SetValue Value"); // Lazy
        returnMatches("color=(red|green|blue)", "color=red color=green color=blue");
        returnMatches("a(?<digit1>[0-5])|b(?<digit2>[4-7])", "a1 a2 a3 a4 a5 b1 b2 b3 b4 b5"); // Named
        returnMatches("(\\d{1})-(\\d{2})-(\\d+)", "1-23-456789");
        // '{}'
        returnMatches(".{4}", "1234567890 abcd"); // [1234, 5678, 90 a] - returns groups with four characters.
    }

    /**
     * If needed match something before character.
     * Driver will check next character before checking current character.
     */
    private static void lookahead() {
        System.out.println("\nLook ahead. (positive).");
        returnMatches(".+?(?=;)", "Some string;");

        System.out.println("\nLook ahead. (negative).");
        returnMatches("q(?!u)", "Iraq uq qu");
    }

    /**
     * If needed match something after character.
     * Driver will check previous character before checking current character.
     */
    private static void lookBehind() {

        //positive
        System.out.println("\nLook behind. (positive).");
        returnMatches("(?<=;).+", "some ';string;"); // matches all after ';'.

        // negative
        System.out.println("\nLook behind. (negative)");
    }

    private static void bracketEx() {
        // 3: Brackets '[]'
        // 3.1: Simple
        returnMatches("[aeou]", "Java Tutorials");
        returnMatches("f[oa]x", "fox animal or fax machine");

        // 3.2: Negation
        returnMatches("[^aoiu]", "Java Tutorials");
        returnMatches("f[^ao]x", "fox animal or fax machine"); // none

        // 3.3: Range
        returnMatches("[a-d]", "Java Tutorials");
        returnMatches("[1-5]", "1 times for 5$");
        returnMatches("[^a-d]", "Java Tutorials");

        // 3.4: Unions OR
        returnMatches("[aeou[0-9]]", "1 times for 5$");
        returnMatches("[aeou0-9]", "1 times for 5$");
        returnMatches("[a-z[A-z]]", "Java Tutorials");
        returnMatches("[a-zA-z]", "Java Tutorials");

        // 3.5: Unions AND
        returnMatches("[aeiou&&[ae]]", "Java Tutorials");
        returnMatches("[0-9&&[4-6]]", "1 times for 5$");

        // 3.6: Unions SUBTRACTION
        returnMatches("[A-z&&[^aeiou]]", "Java Tutorials"); // Consonants only
        returnMatches("[A-z&&[^aeiou]]", "Java_[Tutorials]"); // Characters like '_' and '[' are exist inside A-z range!
        returnMatches("[a-z[A-Z]&&[^aeiou]]", "Java_[Tutorials]"); // Consonants only
        returnMatches("q[^u]", "Iraq"); // need space after 'q' for matching
    }

    private static void slashEx() {
        // 2: ESCAPES '\'
        // 2.1: Escape '.'
        returnMatches("\\.", "abc."); // escaping metacharacter '.', will catch only dots.
        returnMatches("\\.\\.\\.", "Blah blah ... blah blah");
        returnMatches("...", "Blah blah ... blah blah"); // metacharacters grouping. Will grab 1-3 indexes, then next 3 indexes.

        // 2.2: Escape '\'
        returnMatches("\\\\java\\\\", "c:\\java\\"); // escaping '\java\'

        // 2.2: Escape expression
        returnMatches("\\Q[41]\\E", "new int[41]"); // escaping '[41]' line
    }

    private static void dotsExamples() {
        // 1. Any '.'
        returnMatches(".", "abc."); // using metacharacter '.'
        returnMatches("53.254", "107.90.53.254"); // string literals
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

}

