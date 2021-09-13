package com.github.panarik.javaLesson.lang.values.primitive;

import java.util.Arrays;

public class CharacterClass {

    public static void main(String[] args) {

        char a = 'a';
        char A = 'A';
        char a1 = '1';
        char[] arr = {'a', 'b', '+'};

        //.isDigit()
        System.out.println(Character.isDigit(a1));

        //.toLowerCase(A)
        System.out.println(Character.toLowerCase(A));

        //.codePointAt()
        int unicode = Character.codePointAt(arr, 2);
        byte[] bytes = "+".getBytes();
        System.out.println("Unicode '+': "+ unicode);
        System.out.println("Bytes '+': "+ Arrays.toString(bytes));


    }

}
