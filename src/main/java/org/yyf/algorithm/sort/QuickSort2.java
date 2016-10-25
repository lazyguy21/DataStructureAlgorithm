package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-25.
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        quickSort2(0, disorderArray.length - 1, disorderArray);
        System.out.println(Arrays.toString(disorderArray));


    }

//    public static void quickSort(int leftIndex, int rightIndex, int[] src) {
//
//        if (leftIndex < rightIndex) {
//            int pivot = src[leftIndex];
//            int l = leftIndex;
//            int r = rightIndex;
//            while (l < r) {
//                while (l < r && src[r] >= pivot) {
//                    r--;
//                }
//                src[l++] = src[r];
//                while (l < r && src[l] <= pivot) {
//                    l++;
//                }
//                src[r--] = src[l];
//            }
//            src[l] = pivot;
//            quickSort(leftIndex, l - 1, src);
//            quickSort(l + 1, rightIndex, src);
//        }
//    }


    public static void quickSort2(int leftIndex, int rightIndex, int[] src) {
        if (leftIndex >= rightIndex) return;
        int l = leftIndex;
        int r = rightIndex;
        int pivot = src[leftIndex];//左边第一个数作为基准数
        while (l < r) {
            while (l < r && src[r] >= pivot) {
                r--;
            }
            if (l < r) {
                src[l++] = src[r];
            }
            while (l < r && src[l] <= pivot) {
                l++;
            }
            if(l<r){
                src[r--] = src[l];
            }
        }
        src[l] = pivot;
        quickSort2(leftIndex, l - 1, src);
        quickSort2(l + 1, rightIndex, src);

    }
}
