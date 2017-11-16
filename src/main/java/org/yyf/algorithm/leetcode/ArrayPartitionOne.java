package org.yyf.algorithm.leetcode;

import java.util.Arrays;

/**
 * Created by tobi on 2017/5/5.
 * https://leetcode.com/problems/array-partition-i/#/description
 */
public class ArrayPartitionOne {
  public static void main(String[] args) {
    int i = arrayPairSum(new int[]{1, 4, 3, 2});
    System.out.println(i);
  }

  public static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int result=0;
    for (int i = 0; i < nums.length; i=i+2) {
      result += nums[i];
    }
    return result;
  }
}
