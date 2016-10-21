package org.yyf.algorithm.sort;

/**
 * Created by tobi on 16-10-21.
 */
public class TestFor {
    public static void main(String[] args) {
        int t=0;
        for (int i = 0; i < 10; i++) {
            t = i;
            if (i == 4) {
                break;
            }
        }
        System.out.println(t);
    }
}
