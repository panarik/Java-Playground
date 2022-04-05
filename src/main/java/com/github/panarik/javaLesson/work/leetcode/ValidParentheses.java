package com.github.panarik.javaLesson.work.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 */
public class ValidParentheses {

    Map<Character, Character> mapTypes = new HashMap<>();
    Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("must be true:  " + new ValidParentheses().isValid("()"));
        System.out.println("must be true:  " + new ValidParentheses().isValid("()[]{}"));
        System.out.println("must be true:  " + new ValidParentheses().isValid("{[]}"));
        System.out.println("must be false: " + new ValidParentheses().isValid("(]"));
        System.out.println("must be false: " + new ValidParentheses().isValid("]"));
        System.out.println("must be false: " + new ValidParentheses().isValid("]["));
        System.out.println("must be false: " + new ValidParentheses().isValid("([)]"));
    }

    public boolean isValid(String s) {
        initMaps();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // put current character into map.
            putCharToMap(ch, map);

            // Check extra closed brackets. (like '(]')
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() < 0) return false;
            }

            //Check wrong brackets order. (like '([)]')
            if (i > 0) {

                // if previous bracket is open AND current bracket is not open.
                if (isOpenBracket(s.charAt(i - 1)) && !isOpenBracket(ch)) {

                    //all this brackets must be the same type.
                    if (s.charAt(i-1) != mapTypes.get(ch)) return false;
                }
            }

        }

        // Check extra closed brackets. (like '(]')
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) return false;
        }

        return true;
    }

    private void initMaps(){
        map.put('(', 0);
        map.put('[', 0);
        map.put('{', 0);

        mapTypes.put(')', '(');
        mapTypes.put(']', '[');
        mapTypes.put('}', '{');
    }

    private void putCharToMap(char ch, Map<Character, Integer> map) {
        switch (ch) {
            case ('('): {
                map.put('(', map.get('(') + 1);
                break;
            }
            case (')'): {
                map.put('(', map.get('(') - 1);
                break;
            }
            case ('['): {
                map.put('[', map.get('[') + 1);
                break;
            }
            case (']'): {
                map.put('[', map.get('[') - 1);
                break;
            }
            case ('{'): {
                map.put('{', map.get('[') + 1);
                break;
            }
            case ('}'): {
                map.put('{', map.get('{') - 1);
                break;
            }
        }
    }

    private boolean isOpenBracket(char bracket) {
        for (Map.Entry<Character, Character> entry : mapTypes.entrySet()) {
            if (bracket == entry.getValue()) return true;
        }
        return false;
    }
}
