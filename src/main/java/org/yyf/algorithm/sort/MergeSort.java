package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-25.
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        mergeSort(0, disorderArray.length - 1, disorderArray);
        System.out.println(Arrays.toString(disorderArray));
    }

    public static void mergeSort(int left, int right, int[] arrSrc) {
        if (left >= right) {
            return;
        }
        int pivot = (left + right) / 2;
        mergeSort(left,pivot,arrSrc);
        mergeSort(pivot+1,right,arrSrc);

        merge(left, pivot, right,arrSrc);
    }

    private static void merge(int left, int pivot, int right,int[] arrSrc) {
        int length = right - left + 1;
        int[]temp = new int[length];
        int i=left;
        int j=pivot+1;
        int k=0;
        while (i<=pivot&&j<=right){
            if(arrSrc[i]<arrSrc[j]){
                temp[k++] = arrSrc[i++];
            }else {
                temp[k++] = arrSrc[j++];
            }
        }

        while (i<=pivot){
            temp[k++] = arrSrc[i++];
        }

        while (j<=right){
            temp[k++] = arrSrc[j++];
        }
        int a = left;
        for (int l = 0; l < temp.length; l++) {
            arrSrc[a++] = temp[l];
        }

    }
}
