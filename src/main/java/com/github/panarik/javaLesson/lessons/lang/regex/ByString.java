package com.github.panarik.javaLesson.lessons.lang.regex;

/**
 * Class {@link String} method .replaceAll() examples.
 * Class {@link String} method .matches() examples.
 */
public class ByString {

    public static void main(String[] args) {

        // Replacement.
        replacement();

        // Matches
        System.out.println("12345".matches("\\d+"));

    }

    private static void replacement() {

        // Replace with nothing.
        String input2 = "123 abc 123 abc";
        String result2 = input2.replaceAll("\\D", ""); // getting all non digits characters. They will be deleted.
        System.out.println(result2);

        // Replace with something.
        String input = "123456789012345";
        String result = input.replaceAll("(\\d{5})(\\d{3})(\\d{2})(\\d+)", "+0 ($1)-$2-$3:$4");
        System.out.println(result);
    }

}
