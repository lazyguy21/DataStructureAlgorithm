package org.yyf.algorithm.stack;

import java.util.LinkedList;

/**
 * Created by tobi on 16-11-22.
 */
public class SortStack {
    private static Integer minValue;
    private static LinkedList<Integer> helpContainer=new LinkedList<>();

    public static LinkedList sort(LinkedList<Integer> stack) {
        while (!stack.isEmpty()){
            Integer value = stack.pop();
            insert2RightPosition(value);
        }
        return helpContainer;

    }

    public static void insert2RightPosition(Integer value) {
        Integer topValue = helpContainer.peek();
        if (topValue == null) {
            helpContainer.push(value);
            return;
        }
        if (value >= topValue) {
            helpContainer.push(value);
            return;
        }
        if (value < topValue) {
            helpContainer.pop();
            insert2RightPosition(value);
            helpContainer.push(topValue);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> objects = new LinkedList<>();
        objects.push(0);
        objects.push(2);
        objects.push(1);
        objects.push(4);
        objects.push(3);

        System.out.println(objects);
        LinkedList list = sort(objects);
        System.out.println(list);
    }


}
