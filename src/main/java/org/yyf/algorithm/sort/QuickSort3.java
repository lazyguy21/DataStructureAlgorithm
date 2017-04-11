package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-11-16.
 * 快速排序的关键点是选其中一个为基准数（左起第一个）
 */
public class QuickSort3 {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        sort(disorderArray, 0, disorderArray.length - 1);
        System.out.println(Arrays.toString(disorderArray));
    }
    public static void sort(int srcArr[],int startIndex,int endIndex){
        if(startIndex>=endIndex)return;

        int pivot = srcArr[startIndex];//左起第一个数作为标准轴
        int leftIndex = startIndex;
        int rightIndex = endIndex;

        while (leftIndex<rightIndex){//递归到最后，leftindex会等于rightindex
            while (leftIndex < rightIndex && srcArr[rightIndex] >= pivot) {
                rightIndex--;
            }

            if(leftIndex<rightIndex){
                srcArr[leftIndex] = srcArr[rightIndex];
                leftIndex++;
            }

            while (leftIndex < rightIndex && srcArr[leftIndex] <= pivot) {
                leftIndex++;
            }

            if(leftIndex<rightIndex){
                srcArr[rightIndex] = srcArr[leftIndex];
                rightIndex--;
            }
        }
        srcArr[leftIndex] = pivot;

        sort(srcArr,startIndex,leftIndex-1);
        sort(srcArr, leftIndex + 1, endIndex);


    }
}
