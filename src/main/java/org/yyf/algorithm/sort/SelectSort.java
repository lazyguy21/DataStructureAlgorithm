package org.yyf.algorithm.sort;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-21.
 * 选择排序的实质就是每轮选出最小的那个数，依次放到数组的前面去，感觉是最好理解的一种
 * <p>
 * 简单选择排序的比较次数与序列的初始排序无关。 假设待排序的序列有 N 个元素，则比较次数总是N (N - 1) / 2。
 * 而移动次数与序列的初始排序有关。当序列正序时，移动次数最少，为 0.
 * 当序列反序时，移动次数最多，为3N (N - 1) /  2。
 */
public class SelectSort extends Base {

    public static void main(String[] args) {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = i; j < LENGTH; j++) {
                if (DISORDER_ARRAY[j] < DISORDER_ARRAY[i]){
                    exchange(DISORDER_ARRAY, i, j);
                }
            }
        }
        System.out.println(Arrays.toString(DISORDER_ARRAY));
    }
}
