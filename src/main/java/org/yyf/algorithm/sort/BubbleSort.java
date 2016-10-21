package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-7-25.
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        for (int i = 0; i < disorderArray.length-1; i++) {
            for (int j = 0; j < disorderArray.length-1-i; j++) {
                if(disorderArray[j]<disorderArray[j+1]){
                    int temp = disorderArray[j];
                    disorderArray[j] = disorderArray[j + 1];
                    disorderArray[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(disorderArray));
    }
}
