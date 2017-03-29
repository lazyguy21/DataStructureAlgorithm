package org.yyf.algorithm.sort;

import org.yyf.algorithm.Constants;

import java.util.Arrays;

/**
 * Created by tobi on 2017/3/23.
 */
public class Base {
    protected static final int[] DISORDER_ARRAY = Constants.DISORDER_ARRAY;
    protected static final int LENGTH = DISORDER_ARRAY.length;
    public static void exchange(int[] srcArr, int indexI, int indexJ) {
        int temp = srcArr[indexI];
        srcArr[indexI] = srcArr[indexJ];
        srcArr[indexJ] = temp;

    }
    public static void show(){
        System.out.println(Arrays.toString(DISORDER_ARRAY));
    }
}
