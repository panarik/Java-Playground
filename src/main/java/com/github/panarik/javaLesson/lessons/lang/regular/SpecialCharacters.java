package com.github.panarik.javaLesson.lessons.lang.regular;

public class SpecialCharacters {

    private static String any = "."; // One any character.
    private static String escape_any = "\\."; // escape metacharacter (here escape dots)
    private static String withRange = "[...]"; // One character with range inside [...]. Examples: [a-z], [0-9], etc.
    private static String withoutRange = "[^...]"; // One character without range inside [...].
    private static String first = "^"; // First characters in the line.
    private static String last = "$"; // Last characters in the line.
    private static String or = "|"; // Symbol 'or' between expressions.
    private static String combine = "(...)"; // Combine several expressions.
    private static String combineInsensitive = "(?i)()"; // Combine example: (?i)(the) - 'the' will be case insensitive.

    public static void main(String[] abc) {
    }

}


