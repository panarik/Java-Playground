package com.github.panarik.javaLesson.lessons.lang.regular;

public class StringSplit {

    public static void main(String[] args) {
        String string = "This is a first sentence. This is a second sentence. This is a third sentence.";

        // split string around given '.'
        String[] array = string.split("[.]");

        for(String str : array) {
            System.out.println(str);
        }
    }

}