package org.yyf.algorithm.leetcode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description
 * Created by tobi on 2017/4/12.
 */
public class ReverseStringC {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
           result.append(new StringBuilder(strings[i]).reverse());
            result.append(" ");
        }
        return result.substring(0, result.length() - 1);

    }
}
