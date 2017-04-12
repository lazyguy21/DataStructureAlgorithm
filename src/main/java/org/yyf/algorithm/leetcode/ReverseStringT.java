package org.yyf.algorithm.leetcode;

/**
 * https://leetcode.com/problems/reverse-string-ii/#/description
 * Created by tobi on 2017/4/12.
 */
public class ReverseStringT {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
    }
    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int start=0;
        int end=0;
        while(start<=s.length()-1){
            end = Math.min(end+k, s.length());
            String substring = s.substring(start, end);
            result.append(new StringBuilder(substring).reverse());

            if(end>s.length()-1) break;
            start=end;
            end = Math.min(end + k, s.length());
            String subStringNonReverse = s.substring(start, end);
            result.append(subStringNonReverse);

            start=end;
        }
        return result.toString();
    }
}
