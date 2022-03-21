package com.github.panarik.javaLesson.work.leetcode;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{4, 2, 78, 1, 56, 0, 9}, 10)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) if (num < target) list.add(num); // Skip all impossible numbers.
        for (int first = 0; first< nums.length; first++) {
            for (int second = 0; second< nums.length; second++) {
                if (first==second) continue;
                //ToDO: here find sum variants
            }
        }

        return result;
    }

}
