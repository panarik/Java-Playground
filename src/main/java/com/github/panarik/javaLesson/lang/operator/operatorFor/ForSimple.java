package com.github.panarik.javaLesson.lang.operator.operatorFor;

public class ForSimple {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.print(" i=" + i);
        }
        System.out.println();

        for (int i = 0; i <= 10; ) {
            System.out.print(" i=" + (i++));
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.print(" i=" + i);
            if (i == 5) break;
        }

        for (int i = 0; i<=10; i++) {
            System.out.print(" i="+i);
            if (i == 10) System.out.println(" КОНЕЦ!");
        }



    }


}
