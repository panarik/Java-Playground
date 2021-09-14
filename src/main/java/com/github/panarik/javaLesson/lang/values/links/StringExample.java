package com.github.panarik.javaLesson.lang.values.links;

public class StringExample {

    public static void main(String[] args) {

        System.out.println("Hell" + "o!");
        String s1 = "Hell";
        String s2 = "o!";
        System.out.println(s1 + s2);

        String s3 = new String("Hello!");
        String s4 = new String(new char[]{'H','e','l','l','o','!'});
        String s5 = new String(new byte[]{28,49,18,98,55,34});
        String s6 = new String(s3);

        //String + Int
        int a = 1;
        System.out.println("String with int " + a);
        System.out.println("1" + (1+3) );

        //.compareTo
        String a1 = "h";
        String a2 = "a";
        System.out.println(".compareTo: "+a1+" to "+a2+" = "+a1.compareTo(a2)); //прямой вывод compareTo
        System.out.println(letterUp(a1, a2));
    }

    private static String letterUp(String one, String two){
        if (one.compareTo(two) < 0) return one;
        else return two;
    }

}
