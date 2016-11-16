package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-26.
 */
public class MergeSort2 {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        mergeSort(disorderArray, 0, disorderArray.length - 1);
        System.out.println(Arrays.toString(disorderArray));
    }

    public static void mergeSort(int[] src, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) return;
        int pivotIndex = (leftIndex + rightIndex) / 2;
        mergeSort(src, leftIndex, pivotIndex);
        mergeSort(src, pivotIndex + 1, rightIndex);

        int temp[] = new int[rightIndex - leftIndex + 1];//临时容器
        int lStart = leftIndex;
        int rStart = pivotIndex + 1;
        int tempPointer = 0;
        while (lStart <= pivotIndex && rStart <= rightIndex) {
            if (src[lStart] <= src[rStart]) {
                temp[tempPointer++] = src[lStart];
                lStart++;
            } else {
                temp[tempPointer++] = src[rStart];
                rStart++;
            }
        }
        while (lStart <= pivotIndex) {
            temp[tempPointer++] = src[lStart++];
        }
        while (rStart <= rightIndex) {
            temp[tempPointer++] = src[rStart++];
        }

        for (int i = 0; i < temp.length; i++) {
            src[leftIndex++] = temp[i];
        }

    }
}
