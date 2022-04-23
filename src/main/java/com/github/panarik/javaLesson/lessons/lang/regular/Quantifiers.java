package com.github.panarik.javaLesson.lessons.lang.regular;

import java.util.Scanner;

public class Quantifiers {

    public static void main(String[] args) {
        Quantifiers q = new Quantifiers();

        //Предыдущий символ:
        q.print("?", "a a a"); // либо входит в строку один раз либо вообще в неё не входит.
        q.print("*", "aaa"); //        входит в строку любое число раз, в том числе и 0
        q.print("+", "aaa"); //        входит в строку один и более число раз
        q.print("{n}", "aaa"); //      входит в строку n раз
        q.print("{n,}", "aaa"); //     входит в строку n и более количество раз
        q.print("{n,m}", "aaa"); //    входит в строку от n до m раз

        // combine
    }

    private void print(String regex, String inputLine) {
        Scanner scanner = new Scanner(inputLine);
        while (scanner.hasNext()) {
            if (scanner.hasNext(regex)) {
                System.out.println(scanner.next());
            } else scanner.next();
        }
    }

}
