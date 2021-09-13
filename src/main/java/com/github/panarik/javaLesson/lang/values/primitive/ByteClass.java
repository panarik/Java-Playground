package com.github.panarik.javaLesson.lang.values.primitive;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ByteClass {

    public static void main(String[] args) {

        //String to bytes2
        String string = "abc";
        System.out.println("String1: "+ string);
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        System.out.println("Bytes1: "+Arrays.toString(bytes));


        //String to chars to bytes2
        //1 - String to chars
        String s = "abc";
        System.out.println("String2: " + s);
        char[] chars = new char[s.length()];
        for (int j = 0; j < s.length(); j++) chars[j] = s.charAt(j);
        System.out.println("Chars2: " + Arrays.toString(chars));
        //2 - chars to bytes
        byte[] bytes2 = new byte[chars.length];
        for (int i = 0; i < bytes2.length; i++) {
            bytes2[i] = (byte) chars[i];
        }
        System.out.println("Bytes2: " + Arrays.toString(bytes2));


        //Unicode to UTF-8
        String s1 = "\\u0000";
        String s2 = "\\uFFFF";

        byte[] b1 = s1.getBytes(StandardCharsets.UTF_8);
    }


}
