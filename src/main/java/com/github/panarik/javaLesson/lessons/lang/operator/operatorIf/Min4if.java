package com.github.panarik.javaLesson.lessons.lang.operator.operatorIf;

public class Min4if {

    private static int minAB = 0;
    private static int minCD = 0;
    private static int minABCD = 0;


    public static int min(int a, int b, int c, int d) {

        if (c < d)
            minCD = c;
        else
            minCD = d;

        if (getMinAB(a, b) < minCD)
            minABCD = getMinAB(a, b);
        else
            minABCD = minCD;


            return minABCD;
    }

    public static int getMinAB(int a, int b) {


        if (a < b)
            minAB = a;
        else
            minAB = b;

        return minAB;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(getMinAB(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }

}
