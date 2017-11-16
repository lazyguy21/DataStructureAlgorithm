package org.yyf.algorithm.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-colors/#/description
 * Created by tobi on 2017/4/17.
 */
public class SortColor {
    public static void main(String[] args) {
         int[] nums = new int[]{0,2,1,1,0,1,2,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(current==0){
                count0++;
            } else if (current == 1) {
                count1++;
            } else if (current == 0) {
                count2++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i<count0){
                nums[i] = 0;
            }
            else if (i<count0+count1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
