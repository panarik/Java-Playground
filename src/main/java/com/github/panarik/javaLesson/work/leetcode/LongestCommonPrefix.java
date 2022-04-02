package com.github.panarik.javaLesson.work.leetcode;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);
        int letterNumber = 0; // Letter in each string.
        int stringPos = 1; // String position in array. (we already peak first string, and we need check second string)

        // Get prefix for each string.
        for (; letterNumber < strs[stringPos].length(); letterNumber++) {

            // Do that for all strings.
            for (; stringPos < strs.length; stringPos++) {
                char ch = strs[stringPos].charAt(letterNumber); // Current letter.
                if (ch != prefix.charAt(letterNumber)) { // Match with prefix letter.
                    prefix.delete(stringPos, prefix.length() - stringPos);
                    return prefix.toString();
                }
            }
            stringPos = 1;
        }

        return "";
    }

}
