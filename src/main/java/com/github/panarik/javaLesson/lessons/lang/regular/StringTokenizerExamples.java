package com.github.panarik.javaLesson.lessons.lang.regular;

import java.util.StringTokenizer;

/**
 * {@link StringTokenizer} examples.
 */
public class StringTokenizerExamples {

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("first;second;third",";",false);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }



}
