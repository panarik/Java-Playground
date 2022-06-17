package com.github.panarik.javaLesson.lessons.lang.regex;

import java.util.StringTokenizer;

/**
 * {@link StringTokenizer} examples.
 */
public class ByStringTokenizer {

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("first;second;third",";",false);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }



}
