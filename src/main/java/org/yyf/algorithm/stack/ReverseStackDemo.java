package org.yyf.algorithm.stack;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by tobi on 16-11-22.
 * 不适用任何额外的数据结构，只使用递归完成ｓｔａｃｋ倒转
 */
public class ReverseStackDemo {
    public static void main(String[] args) {
        LinkedList<Integer> objects = new LinkedList<>();
        objects.push(1);
        objects.push(2);
        objects.push(3);
        objects.push(4);
        System.out.println(objects);
        reverse(objects);
        System.out.println(objects);
    }
    //取出栈底部的数，并且重要的是stack的其他数任然保持原样(递归出栈之后必须再次还原)
    public static Integer getAndRemoveBottom(LinkedList<Integer> stack) {
        Integer topValue = stack.pop();
        if (stack.isEmpty()) {
            return topValue;
        } else {
            Integer bottomValue = getAndRemoveBottom(stack);
            stack.push(topValue);
            return bottomValue;
        }

    }

    public static void reverse(LinkedList<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Integer bottom = getAndRemoveBottom(stack);

        reverse(stack);
        stack.push(bottom);
    }
}
