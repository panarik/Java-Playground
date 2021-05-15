package main;

import java.io.IOException;

public class ClassesClass {

    private static String TEXT = "Some text";



    public static void main(String[] args) {

        System.out.println(TEXT);

        String mString = "multiple string";
        multiple(mString, 3);
    }

    public static void multiple(String mString, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(mString);
        }

    }


}
