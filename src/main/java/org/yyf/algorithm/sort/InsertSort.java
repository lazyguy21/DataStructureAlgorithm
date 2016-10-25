package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-21.
 */
public class InsertSort {
    public static void main(String[] args) {
//        int[] disorderArray = Constants.DISORDER_ARRAY;
//        for (int i = 1; i < disorderArray.length; i++) {
//            for (int j=i;j>0;j--){
//                if(disorderArray[j]<disorderArray[j-1]){
//                    int temp = disorderArray[j-1];
//                    disorderArray[j-1] = disorderArray[j];
//                    disorderArray[j] = temp;
//                }else {
//                    break;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(disorderArray));

        int[] disorderArray = Constants.DISORDER_ARRAY;
        for (int i = 1; i < disorderArray.length; i++) {
            for (int j = i; j >0&&disorderArray[j]>=disorderArray[j-1]; j--) {
                int temp = disorderArray[j - 1];
                disorderArray[j - 1] = disorderArray[j];
                disorderArray[j] = temp;
            }
        }
        System.out.println(Arrays.toString(disorderArray));
    }
}
