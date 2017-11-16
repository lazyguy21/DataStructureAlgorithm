package org.yyf.algorithm.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by tobi on 2017/4/26.
 * https://leetcode.com/problems/ugly-number/#/description
 */
public class IsUgly {
    public static void main(String[] args) {
        boolean ugly = isUgly(2);
        System.out.println(ugly);
    }
    public static boolean isUgly(int num) {
        if(num==1) return true;
        num=Math.abs(num);
        Set<Integer> factors = new HashSet<>();
        for (int i = 1; i <= num; i++) {
            if(num%i==0&&isPrime(num)&&num!=2&&num!=3&&num!=5)
                factors.add(i);
        }
        return factors.isEmpty() ? true : false;
    }
    private static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num %i == 0) return false;
        }
        return true;
    }
}
