package org.yyf.algorithm.leetcode;

/**
 * https://leetcode.com/problems/reverse-string/#/description
 * Created by tobi on 2017/4/12.
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
        public static String reverseString(String s) {
            char[] chars = s.toCharArray();
            int head=0;
            int tail=chars.length-1;
            while (head<tail){
                char temp=chars[head];
                chars[head]=chars[tail];
                chars[tail]=temp;

                head++;
                tail--;
            }
            return new String(chars);
        }

}
