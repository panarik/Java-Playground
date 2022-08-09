package com.github.panarik.javaLesson.work.leetcode;

public class NonRepeatableChar {

    public static void main(String[] args) {
        NonRepeatableChar main = new NonRepeatableChar();
        System.out.println(main.parse("ablcabcfadcg"));
    }

    /**
     * This method should return the first no repeatable letter from parameter.
     *
     * Example.
     *  Input: analogy. Returned: 'n'.
     *  Input: astrology. Returned: 'a'.
     *
     * @param input {@link String}
     * @return result {@link char}
     */
    public char parse(String input) {
        char temp;
        char result = ' ';
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            for (int j = 0; j < input.length(); j++) {
                if (i != j && input.charAt(j) == temp) {
                    temp = ' ';
                    break;
                }
            }
            if (temp != ' ') {
                result = temp;
                return result;
            }

        }
        return result;
    }

}
