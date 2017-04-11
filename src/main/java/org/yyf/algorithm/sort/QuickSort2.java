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
        while (l < r) {//这是中间的一轮循环，将左右２边分别有序
            while (l < r && src[r] >= pivot) {//因为基准数为左边第一个数，所以先从右边找
                r--;
            }
            if (l < r) {//这个判断条件是必要的，当l==r时，如果执行了下面代码之后，l++就会指向错误的位置
                src[l++] = src[r];//找到后将右边比基准数小的数放到左边坑的位置（第一次的坑就是基准数的位置）
            }
            while (l < r && src[l] <= pivot) {
                l++;
            }
            if(l<r){
                src[r--] = src[l];
            }
        }
        src[l] = pivot;//最后l==r,将一开始的基准数插入此位置，则左右２边，大小有序。
        quickSort2(leftIndex, l - 1, src);//再递归排序左边
        quickSort2(l + 1, rightIndex, src);//排序右边

    }
}
