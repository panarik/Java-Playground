package com.github.panarik.javaLesson.lessons.lang.regex.usesFor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CropURL {

    public static void main(String[] args) {
        cropURL("Игорь ждет перевод. Перейдите по ссылке: https://domenname.com/home/");
    }

    private static void cropURL(String input) {
        Matcher m = Pattern.compile("[h](.)+").matcher(input);
        if(m.find()) System.out.println(m.group(0));
    }

}
