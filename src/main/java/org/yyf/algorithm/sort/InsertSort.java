package org.yyf.algorithm.sort;

import java.util.Arrays;

/**
 * Created by tobi on 16-10-21.
 * 在最坏情况下，数组完全逆序，插入第2个元素时要考察前1个元素，插入第3个元素时，要考虑前2个元素，……，插入第N个元素，
 * 要考虑前 N - 1 个元素。因此，最坏情况下的比较次数是 1 + 2 + 3 + ... + (N - 1)，等差数列求和，
 * 结果为 N*(N-1)/ 2，所以最坏情况下的复杂度为 O(N^2)。
 * <p>
 * 最好情况下，数组已经是有序的，每插入一个元素，只需要考查前一个元素1+1+1+1 ...+1，因此最好情况下，插入排序的时间复杂度为O(N)
 */
public class InsertSort extends Base {
    public static void main(String[] args) {
        for (int i = 1; i < LENGTH; i++) {
            while (i > 0 && DISORDER_ARRAY[i] < DISORDER_ARRAY[i - 1]) {
                exchange(DISORDER_ARRAY, i, i - 1);
                i--;
            }

        }
        show();
    }

}
