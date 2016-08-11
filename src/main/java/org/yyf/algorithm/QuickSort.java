package org.yyf.algorithm;

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
        if (left < right) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = left, j = right, pivot = s[left];
            while (i < j) {
                while (i < j && s[j] >= pivot) // 从右向左找第一个小于中轴基数的数
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < pivot) // 从左向右找第一个大于等于中轴基数的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = pivot;
            quickSort(s, left, i - 1); // 递归调用
            quickSort(s, i + 1, right);
        }
    }

    void exchangeElement(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
