package com.github.panarik.javaLesson.work.leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Given a roman numeral, convert it to an integer.
 */
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger().romanToInt("VI"));
    }

    public int romanToInt(String s) {

        //Create digit groups;
        int digitTen = 0;

        // Create map.
        Map<Character, Integer> map = getMap();

        //Parse Roman digit to groups
        for (int i = s.length(); i > 0; i--) {
            char ch = s.charAt(i - 1);
            boolean isLast = (i == s.length()); // Last digit in line.
            boolean isFirst = (i == 1); // First digit in line.
            digitTen = digitTen + map.get(ch);

            //Code block for parse tens
            if (ch == 'V') { //Found five!
                if (isLast & !isFirst) { // Before fire has more digits;
                    while (i >1 && s.charAt(i-2) == 'I') {
                        digitTen--;
                        i--;
                    }
                }
            }
        }
        return digitTen;
    }

    private Map<Character, Integer> getMap() {
        Map<Character, Integer> map = new TreeMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }

}
