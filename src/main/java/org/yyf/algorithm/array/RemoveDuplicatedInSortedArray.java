package org.yyf.algorithm.array;

import java.util.Arrays;

/**
 * Created by tobi on 2017/2/16.
 */
public class RemoveDuplicatedInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 5, 6, 6};
        removeDuplicatedInSortedArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static Integer removeDuplicatedInSortedArray(int[] nums){
        if(nums==null) return null;
        if(nums.length==0) return 0;

        if (nums.length == 0) return 0;

        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index-1])
                nums[index++] = nums[i];
        }
        return index;
    }
}
