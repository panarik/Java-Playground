package com.github.panarik.javaLesson.work.leetcode;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{0, 3, 0}, 0)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int first = 0; first < nums.length; first++) {
            for (int second = 0; second < nums.length; second++) {
                if (first == second) continue; //Don't sum digit itself.
                else if (nums[first]+ nums[second]==target) {
                    result[0] = first;
                    result[1] = second;
                    return result;
                }
            }
        }
        return result; // indexes numbers
    }

}
