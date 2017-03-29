package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 16-7-25. 冒泡排序
 * 每次从第一个数开始，与后面的数比较，如果前者大于后者，则交换
 * 接着继续比较第二个数和第三个数，这样到最后一个数的时候，最后一个数放的就是最大的数(这就是冒泡，不停的比较，将最大的数放到最后面）
 * 这是第一轮
 * 接下来重复第二轮，但是末尾的结束是在倒第二个数，因为刚才第一轮已经将最后一个位置放上最大数了。
 * 重复直到第一个位置放好有序数结束
 * O(n2)
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] disorderArray = Constants.DISORDER_ARRAY;
        for (int i = 0; i <disorderArray.length-1; i++) {//这里的i其实代表的是每轮循环后面不需要比较的位置数
            for (int j = 0; j < disorderArray.length-1-i; j++) {//这个循环完成一轮，代表着一个无序数列中的"最大数"被冒泡到数列的尾部，具体的位置就是disorderArray.length-1-i
                if(disorderArray[j]>disorderArray[j+1]){//如果前一个位置的数大于后一个位置，则交换
                    int temp = disorderArray[j];
                    disorderArray[j] = disorderArray[j + 1];
                    disorderArray[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(disorderArray));
    }
}
