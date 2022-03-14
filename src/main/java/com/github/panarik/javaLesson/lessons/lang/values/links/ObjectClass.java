package com.github.panarik.javaLesson.lessons.lang.values.links;

public class ObjectClass {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        //.getClass
        System.out.println(o1.getClass());
        //.equals
        System.out.println(o1.equals(o2));

        //.toString
        System.out.println(o1);
        o1 = "string";
        System.out.println(o1);

    }


}
