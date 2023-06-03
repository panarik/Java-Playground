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

        System.out.println("\n'^'");
        returnMatches(Pattern.compile("^"), "Java Tutorials");

        System.out.println("\n'|'");
        returnMatches(Pattern.compile("I said (yes|no|maybe)"), "I said yes");
    }

    /**
     * Parentheses '()' for Grouping and Capturing.
     */
    private static void parentheses() {
        returnMatches(Pattern.compile("Set(Value)?"), "Set SetValue Value");
        returnMatches(Pattern.compile("Set(Value)??"), "Set SetValue Value"); // Lazy
        returnMatches(Pattern.compile("color=(red|green|blue)"), "color=red color=green color=blue");
        returnMatches(Pattern.compile("a(?<digit1>[0-5])|b(?<digit2>[4-7])"), "a1 a2 a3 a4 a5 b1 b2 b3 b4 b5"); // Named
        returnMatches(Pattern.compile("(\\d{1})-(\\d{2})-(\\d+)"), "1-23-456789");
    }

    /**
     * If needed match something before character.
     * Driver will check next character before checking current character.
     */
    private static void lookahead() {
        System.out.println("\nLook ahead. (positive).");
        returnMatches(Pattern.compile(".+?(?=;)"), "Some string;");

        System.out.println("\nLook ahead. (negative).");
        returnMatches(Pattern.compile("q(?!u)"), "Iraq uq qu");
    }

    /**
     * If needed match something after character.
     * Driver will check previous character before checking current character.
     */
    private static void lookBehind() {

        //positive
        System.out.println("\nLook behind. (positive).");
        returnMatches(Pattern.compile("(?<=;).+"), "some ';string;"); // matches all after ';'.

        // negative
        System.out.println("\nLook behind. (negative)");
    }

    private static void bracketEx() {
        // 3: Brackets '[]'
        // 3.1: Simple
        returnMatches(Pattern.compile("[aeou]"), "Java Tutorials");
        returnMatches(Pattern.compile("f[oa]x"), "fox animal or fax machine");

        // 3.2: Negation
        returnMatches(Pattern.compile("[^aoiu]"), "Java Tutorials");
        returnMatches(Pattern.compile("f[^ao]x"), "fox animal or fax machine"); // none

        // 3.3: Range
        returnMatches(Pattern.compile("[a-d]"), "Java Tutorials");
        returnMatches(Pattern.compile("[1-5]"), "1 times for 5$");
        returnMatches(Pattern.compile("[^a-d]"), "Java Tutorials");

        // 3.4: Unions OR
        returnMatches(Pattern.compile("[aeou[0-9]]"), "1 times for 5$");
        returnMatches(Pattern.compile("[aeou0-9]"), "1 times for 5$");
        returnMatches(Pattern.compile("[a-z[A-z]]"), "Java Tutorials");
        returnMatches(Pattern.compile("[a-zA-z]"), "Java Tutorials");

        // 3.5: Unions AND
        returnMatches(Pattern.compile("[aeiou&&[ae]]"), "Java Tutorials");
        returnMatches(Pattern.compile("[0-9&&[4-6]]"), "1 times for 5$");

        // 3.6: Unions SUBTRACTION
        returnMatches(Pattern.compile("[A-z&&[^aeiou]]"), "Java Tutorials"); // Consonants only
        returnMatches(Pattern.compile("[A-z&&[^aeiou]]"), "Java_[Tutorials]"); // Characters like '_' and '[' are exist inside A-z range!
        returnMatches(Pattern.compile("[a-z[A-Z]&&[^aeiou]]"), "Java_[Tutorials]"); // Consonants only
        returnMatches(Pattern.compile("q[^u]"), "Iraq"); // need space after 'q' for matching
    }

    private static void slashEx() {
        // 2: ESCAPES '\'
        // 2.1: Escape '.'
        returnMatches(Pattern.compile("\\."), "abc."); // escaping metacharacter '.', will catch only dots.
        returnMatches(Pattern.compile("\\.\\.\\."), "Blah blah ... blah blah");
        returnMatches(Pattern.compile("..."), "Blah blah ... blah blah"); // metacharacters grouping. Will grab 1-3 indexes, then next 3 indexes.

        // 2.2: Escape '\'
        returnMatches(Pattern.compile("\\\\java\\\\"), "c:\\java\\"); // escaping '\java\'

        // 2.2: Escape expression
        returnMatches(Pattern.compile("\\Q[41]\\E"), "new int[41]"); // escaping '[41]' line
    }

    private static void dotsExamples() {
        // 1. Any '.'
        returnMatches(Pattern.compile("."), "abc."); // using metacharacter '.'
        returnMatches(Pattern.compile("53.254"), "107.90.53.254"); // string literals
    }

    private static void returnMatches(Pattern pattern, String input) {
        Matcher matcher = pattern.matcher(input); // get matchers with current input
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group()); // add matchers to list
        }
        System.out.println(String.format("Regex:'%s'. Input:'%s'. Matches:%s.", pattern.pattern(), input, matches));
    }

}


