package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-26.
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        shellSort(disorderArray);
        System.out.println(Arrays.toString(disorderArray));
    }
//    public static void shellSort(int[] src){
//        int length = src.length;
//        for (int gap = length/2; gap >0 ; gap=gap/2) {
//            for (int i = 0; i < gap; i++) {
//                for(int j=i+gap;j<length;j=j+gap){
//                   if(src[j]<src[j-gap])
//                }
//            }
//        }
//    }

    public static void shellSort(int[] src) {
        //步长依次折半，直到等于1，注意，最后的步长必须为1，相当于最后一次是简单的插入排序(只不过大多数的数都已经基本有序了）
        for (int gap = src.length / 2; gap > 0; gap = gap / 2) {
            //步长有多长，就会有多少个小的分组需要进行插入排序（这里感觉好微妙）
            for (int n = 0; n < gap; n++) {
                //一个小组的循环从n开始，如果m+gap<src.length-1,表示这个组还有下一个数，则比较交换，然后m往前迈一个步长，重复直至最后一个数
                //注意下面这2个for循环就是一个小组的一次插入排序，注意取的初始值是什么，为什么
                for (int m = n; m < src.length ; m = m + gap) {
                    for (int i = m; i > n && src[i] < src[i - gap]; i -= gap) {
                        int temp = src[i];
                        src[i] = src[i - gap];
                        src[i - gap] = temp;
                    }
                }
            }
        }
    }
}
