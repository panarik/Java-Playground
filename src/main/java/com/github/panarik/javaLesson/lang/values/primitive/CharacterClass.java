package com.github.panarik.javaLesson.lang.values.primitive;

import java.util.Arrays;

public class CharacterClass {

    public static void main(String[] args) {

        //присваивание готового символа
        char a = 'a';
        char A = 'A';
        char a1 = '1';
        System.out.println(a);

        //присваивание UTF-8 кода
        char fromUTF = 65535;
        System.out.println(fromUTF);
        char threeChar = '\u03A6'; //Unicode
        char returnChar = '\n';
        char fourChar = '\\';


        //.isDigit()
        System.out.println(Character.isDigit(a1));

        //.toLowerCase(A)
        System.out.println(Character.toLowerCase(A));

        //.codePointAt()
        char[] arr = {'a', 'b', '+'};
        int unicode = Character.codePointAt(arr, 2);
        byte[] bytes = "+".getBytes();
        System.out.println("Unicode '+': "+ unicode);
        System.out.println("Bytes '+': "+ Arrays.toString(bytes));

        //Константы
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);



    }

}
