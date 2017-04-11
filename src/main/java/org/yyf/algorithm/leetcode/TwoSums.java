package org.yyf.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tobi on 2017/4/11.
 * 问题描述 https://leetcode.com/problems/two-sum/#/description
 * 代码的解决思路是循环用和减去数组中的当前位置的值，如果在暂存容器map中没有相应的数组值，就放入
 * 如果有则返回map中相应值在数组中的index，和当前遍历到的index
 * 此题关键是使用了map作为一个查找的容器。
 */
public class TwoSums {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> tempContainer = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if(!tempContainer.containsKey(target-numbers[i])){
                tempContainer.put(numbers[i], i);
            }else {
                result[0] = tempContainer.get(target - numbers[i]);
                result[1] = i;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 18);
        System.out.println(Arrays.toString(ints));
    }
}
