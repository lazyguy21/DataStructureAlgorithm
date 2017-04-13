package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-11-15.
 */
public class MergeSort3 {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        mergeSort(disorderArray,0,disorderArray.length-1);
        System.out.println(Arrays.toString(disorderArray));
    }

    public static void mergeSort(int[] srcArray,int startIndex,int endIndex){
        if(startIndex>=endIndex) return;//递归的最小处理办法，分到最后，endIndex=startIndex，只有一个数的组天然有序

        int pivotIndex = startIndex + (endIndex - startIndex) / 2;
        mergeSort(srcArray, startIndex, pivotIndex);
        mergeSort(srcArray,pivotIndex+1,endIndex);

        //将左右2数组依序放入temp数组
        int tempLength = endIndex - startIndex + 1;
        int[] temp = new int[tempLength];
        int lIndex=startIndex;
        int rIndex = pivotIndex + 1;
        int n=0;
        while(lIndex<=pivotIndex&&rIndex<=endIndex){
            if (srcArray[lIndex] <= srcArray[rIndex]) {
                temp[n++] = srcArray[lIndex++];
            } else if (srcArray[lIndex] > srcArray[rIndex]) {
                temp[n++] = srcArray[rIndex++];
            }
        }
        while (lIndex<=pivotIndex){
            temp[n++] = srcArray[lIndex++];
        }
        while (rIndex <= endIndex) {
            temp[n++] = srcArray[rIndex++];
        }
        //将temp数组放回原数组相应位置
        int m=startIndex;
        for (int i = 0; i < temp.length; i++) {
            srcArray[m++] = temp[i];
        }

    }


}
