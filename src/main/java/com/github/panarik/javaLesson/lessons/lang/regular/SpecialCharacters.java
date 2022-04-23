package com.github.panarik.javaLesson.lessons.lang.regular;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharacters {

    private static String any = "."; // One any character.
    private static String escape_any = "\\."; // escape metacharacter (here escape dots)
    private static String withRange = "[...]"; // One character with range inside [...].  Example: [a9]  - only 'a' and '9'. [0-9] - all from '0' to '9'.
    private static String withoutRange = "[^...]"; //  any character except inside [...]. Example: [^a0] - any except 'a' and '0'.
    private static String first = "^"; // First characters in the line.
    private static String last = "$"; // Last characters in the line.
    private static String or = "|"; // Symbol 'or' between expressions.
    private static String combine = "(...)"; // Combine several expressions.
    private static String combineInsensitive = "(?i)()"; // Combine example: (?i)(the) - 'the' will be case insensitive.

    public static void main(String[] abc) {

        //Simple
        System.out.println(returnMatches("[aeou]", "Java Tutorials"));
        System.out.println(returnMatches("f[oa]x", "fox animal or fax machine"));

        //Negation
        System.out.println(returnMatches("[^aoiu]", "Java Tutorials"));
        System.out.println(returnMatches("f[^ao]x", "fox animal or fax machine")); // none

        //Range
        System.out.println(returnMatches("[a-d]", "Java Tutorials"));
        System.out.println(returnMatches("[1-5]", "1 times for 5$"));
        System.out.println(returnMatches("[^a-d]", "Java Tutorials"));

        // Unions OR
        System.out.println(returnMatches("[aeou[0-9]]", "1 times for 5$"));
        System.out.println(returnMatches("[aeou0-9]", "1 times for 5$"));
        System.out.println(returnMatches("[a-z[A-z]]", "Java Tutorials"));
        System.out.println(returnMatches("[a-zA-z]", "Java Tutorials"));

        //Unions AND
        System.out.println(returnMatches("[aeiou&&[ae]]", "Java Tutorials"));

        //Unions SUBTRACTION
        System.out.println(returnMatches("[A-z&&[^aeiou]]", "Java Tutorials"));
        System.out.println(returnMatches("[A-z&&[^aeiou]]", "Java_[Tutorials]")); // Characters like '_' and '[' are exist inside A-z range!

    }

    private static List<String> returnMatches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex); // compile regex
        Matcher matcher = pattern.matcher(input); // get matchers with current input
        List<String> matches = new ArrayList<>();
        while (matcher.find()) {
            matches.add(matcher.group()); // add matchers to list
        }
        return matches;
    }

}


