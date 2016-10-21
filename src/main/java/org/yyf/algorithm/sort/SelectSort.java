package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-21.
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        for (int i = 0; i < disorderArray.length; i++) {
            for (int j = i; j < disorderArray.length; j++) {
                   if(disorderArray[i]<disorderArray[j]){
                       int temp = disorderArray[i];
                       disorderArray[i] = disorderArray[j];
                       disorderArray[j]=temp;
                   }
            }
        }
        System.out.println(Arrays.toString(disorderArray));
    }
}
