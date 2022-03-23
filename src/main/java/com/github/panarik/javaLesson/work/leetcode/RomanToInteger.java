package com.github.panarik.javaLesson.work.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("IX"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(); // Create a map with digits.
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int digit = 0; // Create digit groups;

        // Parse Roman digits.
        // Go backward. Starts with second digit.
        for (int i = s.length() - 1; i >= 0; ) {
            char chCurrent = s.charAt(i); // Current digit.
            boolean isLast = (i == 0); // Last digit in line.

            // Definite the next digit is less.
            if (!isLast && map.get(s.charAt(i - 1)) < map.get(s.charAt(i))) { // Previous less
                digit = digit + map.get(s.charAt(i));
                digit = digit - map.get(s.charAt(i - 1));
                i -= 2; // Skip previous. It's used.
            } else  {
                digit = digit + map.get(s.charAt(i));
                i--;
            }
        }
        return digit;
    }

}
