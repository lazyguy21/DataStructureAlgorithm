package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-8-11.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        quickSort(disorderArray, 0, disorderArray.length - 1);
        System.out.println(Arrays.toString(disorderArray));
    }

    //快速排序
    static void quickSort(int s[], int left, int right) {
        if (left >= right) return;
        int l = left;
        int r = right;
        int pivot = s[left];
        while (r > l) {
            while (r > l && s[r] >= pivot) {
                r--;
            }
            if (r > l) {
                s[l] = s[r];
                l++;
            }

            while (r > l && s[l] <= pivot) {
                l++;
            }
            if (r > l) {
                s[r] = s[l];
                r--;
            }
        }
        s[l] = pivot;
        quickSort(s,left,l-1);
        quickSort(s,l+1,right);

    }

    void exchangeElement(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
