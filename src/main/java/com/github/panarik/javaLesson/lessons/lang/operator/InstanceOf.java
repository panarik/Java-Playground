package com.github.panarik.javaLesson.lessons.lang.operator;

public class InstanceOf {

    public static void main(String[] args) {
        String s = new String();
        if (s instanceof Object) System.out.println("yep, its Object");
        if (s instanceof String) System.out.println("yep, its String");
    }

}
