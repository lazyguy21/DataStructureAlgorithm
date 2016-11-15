package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-21.
 * 在最坏情况下，数组完全逆序，插入第2个元素时要考察前1个元素，插入第3个元素时，要考虑前2个元素，……，插入第N个元素，
 * 要考虑前 N - 1 个元素。因此，最坏情况下的比较次数是 1 + 2 + 3 + ... + (N - 1)，等差数列求和，
 * 结果为 N*(N-1)/ 2，所以最坏情况下的复杂度为 O(N^2)。
 
   最好情况下，数组已经是有序的，每插入一个元素，只需要考查前一个元素1+1+1+1 ...+1，因此最好情况下，插入排序的时间复杂度为O(N)
 */
public class InsertSort {
    //    public static void main(String[] args) {
////        int[] disorderArray = Constants.DISORDER_ARRAY;
////        for (int i = 1; i < disorderArray.length; i++) {
////            for (int j=i;j>0;j--){
////                if(disorderArray[j]<disorderArray[j-1]){
////                    int temp = disorderArray[j-1];
////                    disorderArray[j-1] = disorderArray[j];
////                    disorderArray[j] = temp;
////                }else {
////                    break;
////                }
////            }
////        }
////        System.out.println(Arrays.toString(disorderArray));

//    }
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        for (int i = 1; i < disorderArray.length; i++) {//从1开始，因为0前面没有数
            //j代表着真正的一轮循环，为每一个i位置上的数找到属于它的在i左边的有序部分里面的位置
            //因为这种循环是从i开始的位置和前面的数不停的比较，如果后面大于前面则交换，所以叫插入排序
            for (int j=i;j>0&&disorderArray[j]<disorderArray[j-1];j--) {
                int temp = disorderArray[j-1];
                disorderArray[j - 1] = disorderArray[j];
                disorderArray[j] = temp;
            }
        }
        System.out.println(Arrays.toString(disorderArray));
    }
}
