package com.github.panarik.javaLesson.work.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] strs1 = {"dog", "racecar", "car"};
        String[] strs2 = {"dog", "", "car"};
        String[] strs3 = {"a"};
        String[] strs4 = {"ab", "a"};
        String[] strs5 = {"a", "ab"};
        String[] strs6 = {""};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs1));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs2));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs3));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs4));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs5));
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs6));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);
        int letterNumber = 0; // Letter in each string.
        int stringPos = 0; // String position in array.

        // Get prefix for each string.
        for (; letterNumber < strs[stringPos].length(); letterNumber++) {

            // Do that for all strings.
            for (; stringPos < strs.length; stringPos++) {
                if (strs[stringPos].length() == 0) return "";
                char ch=' '; // Current letter.
                try {
                    ch = strs[stringPos].charAt(letterNumber);
                } catch (StringIndexOutOfBoundsException e) {
                    prefix.delete(letterNumber, prefix.length());
                    return prefix.toString();
                }

                if (ch != prefix.charAt(letterNumber)) { // Match with prefix letter.
                    prefix.delete(letterNumber, prefix.length());
                    return prefix.toString();
                }
            }
            stringPos = 0;
        }

        return prefix.toString();
    }

}
