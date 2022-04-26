package com.github.panarik.javaLesson.lessons.lang.regular.usesFor;

import java.util.regex.Pattern;

public class HasDigit {

    public static void main(String[] args) {
        System.out.println(hasDigit(" Blah Blah 0."));
        System.out.println(hasDigit(" Blah Blah."));
        System.out.println(hasDigit(" Blah Blah._()[]{}"));
        System.out.println(hasDigit(" Blah Blah. {-8.9}}"));
    }

    private static boolean hasDigit(String line) {
        return Pattern.compile("[\\d]").matcher(line).find();
    }

}
