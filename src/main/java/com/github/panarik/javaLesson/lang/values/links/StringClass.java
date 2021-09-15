package com.github.panarik.javaLesson.lang.values.links;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringClass {

    public static void main(String[] args) {

        System.out.println("hell" + "o!");
        String s1 = "hell";
        String s2 = "o!";
        System.out.println(s1 + s2);

        String s3 = new String("Hello!");
        System.out.println(new String(new char[]{'H', 'e', 'l', 'l', 'o', '!'}));
        System.out.println(new String(new byte[]{72, 101, 108, 108, 111, 33}));
        String s6 = new String(s3);

        //String + Int
        int a = 1;
        System.out.println("String with int " + a);
        System.out.println("1" + (1 + 3));

        //.compareTo
        String a1 = "Hello!";
        String a2 = "Buy!";
        System.out.println(".compareTo: " + a1 + " to " + a2 + " = " + a1.compareTo(a2)); //прямой вывод compareTo
        System.out.println(letterUp(a1, a2));

        //.toCharArray
        char[] chars = a1.toCharArray();
        System.out.println(Arrays.toString(chars));

        //.getBytes
        byte[] bytes = a1.getBytes();
        System.out.println(Arrays.toString(bytes));
        byte[] bytes1 = a1.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes1));
        byte[] bytes2 = a1.getBytes(StandardCharsets.US_ASCII);
        System.out.println(Arrays.toString(bytes2));
        //обратно с помощью конструктора
        System.out.println(new String(bytes));
        //с помощью рук
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            if (Character.isValidCodePoint(b)) builder.append((char)b);
        }
        System.out.println("build: "+builder);

        //.toUpperCase
        System.out.println(a1.toUpperCase());

        //.toLowerCase
        System.out.println(a1.toLowerCase());

        //.charAt
        System.out.println(a1.charAt(0));

        //.length
        System.out.println(a1.length());

        //.replace
        String r = "before";
        System.out.println(r);
        System.out.println(r.replace('e', 'A'));
        System.out.println(r);

        //.substring
        String s = "Hello!";
        System.out.println(s);
        System.out.println(s.substring(1, 5));
        System.out.println(s);
    }

    private static String letterUp(String target, String current) {
        if (target.compareTo(current) > 0)
            return current; //если target дальше по алфавиту, то будет положительное число
        else return target;
    }

}
