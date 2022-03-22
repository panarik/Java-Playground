package com.github.panarik.javaLesson.work.leetcode;

/**
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 *
 * For example, 121 is a palindrome while 123 is not.
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(new PalindromeNumber().isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        Integer init = x;
        StringBuilder reversed = new StringBuilder(init.toString());
        reversed.reverse();
        return init.toString().equals(reversed.toString());
    }

}
