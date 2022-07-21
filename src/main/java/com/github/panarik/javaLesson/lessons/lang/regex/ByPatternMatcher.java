package com.github.panarik.javaLesson.lessons.lang.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ByPatternMatcher {

    public static void main(String[] args) {

        //Pattern class
        returnIndex(); // Method '.start()' examples
        matches(); //     Method '.matches(String regex, CharSequence input)' examples
        pattern(); //     Method '.pattern()' examples
        quote(); //       Method '.quote()' examples
        split(); //       Method '.split(CharSequence input)' examples
        flags(); //       Method '.flags()' examples

        //Matcher class
        returnMatches("[aeo]", "Java Tutorials");

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

    private static void flags() {
        Pattern p = Pattern.compile("the", Pattern.CASE_INSENSITIVE);
        System.out.println("p.flags() = "+ p.flags());
    }

    private static void split() {
        Pattern p = Pattern.compile(" ", Pattern.CASE_INSENSITIVE);
        String[] array = p.split("The squeaky wheel gets the grease.");
        System.out.println(Arrays.toString(array));
    }

    private static void quote() {
        System.out.println("Pattern.quote(\".+the.+\") = " + Pattern.quote(".+the.+"));
        System.out.println("Pattern.quote(\"20{4}\")" + Pattern.quote("20{4}"));
        System.out.println("Pattern.quote(\"2\\\\d{4}\"))" + Pattern.quote("2\\d{4}"));
    }

    private static void pattern() {
        Pattern pattern = Pattern.compile(".+the.+");
        System.out.println("pattern.pattern() = " + pattern.pattern());
    }

    /**
     * Method '.matches(String regex, CharSequence input)' examples
     */
    private static void matches() {
        boolean b1 = Pattern.matches("the", "The squeaky wheel gets the grease."); // negative
        System.out.println("Pattern.matches(\"the\", \"The squeaky wheel gets the grease.\") = " + b1);

        boolean b2 = Pattern.matches("the", "the"); // absolutely matches
        System.out.println("Pattern.matches(\"the\", \"the\") = " + b2);

        boolean b3 = Pattern.matches("the", "the "); // negative
        System.out.println("Pattern.matches(\"the\", \"the \") = " + b3);

        boolean b4 = Pattern.matches(".the.", "The squeaky wheel gets the grease."); // any character around 'the' but only 5 characters length will be matched
        System.out.println("Pattern.matches(\".the.\", \"The squeaky wheel gets the grease.\") = " + b4);

        boolean b5 = Pattern.matches("the.", "the "); // 'the' plus one any character.
        System.out.println("Pattern.matches(\"the.\", \"the \") = " + b5);

        boolean b6 = Pattern.matches(".{1,}the.{1,}", "The squeaky wheel gets the grease."); // 'the' plus one or more characters around
        System.out.println("Pattern.matches(\".{1,}the.{1,}\", \"The squeaky wheel gets the grease.\") = " + b6);

        boolean b7 = Pattern.matches(".+the.+", "The squeaky wheel gets the grease."); // 'the' plus one or more characters around
        System.out.println("Pattern.matches(\".+the.+\", \"The squeaky wheel gets the grease.\") = " + b7);
    }

    /**
     * Examples pattern matcher which returns index of matching.
     */
    private static void returnIndex() {
        System.out.println("Searching string: The squeaky wheel gets the grease.");
        Pattern patternInsensitive = Pattern.compile("the", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = patternInsensitive.matcher("The squeaky wheel gets the grease.");
        while (matcher1.find()) {
            System.out.println("Pattern.compile(\"the\", Pattern.CASE_INSENSITIVE) index = " + matcher1.start());
        }
        System.out.println("\n");
        Pattern pattern2 = Pattern.compile("(?i)(the)");
        Matcher matcher2 = pattern2.matcher("The squeaky wheel gets the grease.");
        while (matcher2.find()) {
            System.out.println("Pattern.compile(\"(?i)(the)\") index = " + matcher2.start());
        }
    }

}
