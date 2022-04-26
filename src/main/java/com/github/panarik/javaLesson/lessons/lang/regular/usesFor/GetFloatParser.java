package com.github.panarik.javaLesson.lessons.lang.regular.usesFor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetFloatParser {

    public static void main(String[] args) {
        float fl1 = getFloat("Some string with 5,5 $");
        float fl2 = getFloat("Some string with 15.5 US dollars");
        float fl3 = getFloat("Some string with -15.5 US dollars");
        float fl4 = getFloat("Some string with - 20.5 US dollars");
        float fl5 = getFloat("Some string with 150 000 US dollars");
        float fl6 = getFloat("Some string with 1500.90 US dollars");
        float fl7 = getFloat("Some string with 150 000.90 US dollars");
        System.out.printf("%s, %s, %s, %s, %s, %s, %s", fl1, fl2, fl3, fl4, fl5, fl6, fl7);
    }

    private static float getFloat(String string) {
        float result = 0.0f;
        Pattern pattern = Pattern.compile("(?<negatives>[-]?)(?<digits>[0-9]+)(?<decades>.[0-9]+)?"); // create pattern for matching with given string
        Matcher matcher = pattern.matcher(string);

        // get chars from given string with regex filter
        while (matcher.find()) {
            string = matcher.group();
        }

        // clearing string
        String clearedText = string
                .replace(",", ".")
                .replace(" ", "");

        // parse to float
        try {
            result = Float.parseFloat(clearedText);
        } catch (NumberFormatException e) {
            System.err.println("Can't parse '" + clearedText + ".");
            e.printStackTrace();
        }
        return result;
    }

}
