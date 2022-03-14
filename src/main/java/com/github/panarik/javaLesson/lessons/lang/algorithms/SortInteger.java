package com.github.panarik.javaLesson.lessons.lang.algorithms;

import java.util.Arrays;

public class SortInteger {

    public static void main(String[] args) {

        int[] arr = {5,4,9,1,5,5,-50, 99};

        System.out.println("before: "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("after: "+ Arrays.toString(arr));
    }

    private static int[] sort(int[] arr) {
        for (int i = 1; i<arr.length; i++) {
            int cash = arr[i];
            int j = i;
            while (j>0 && arr[j-1]>cash) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = cash;
        }
        return arr;
    }

}
