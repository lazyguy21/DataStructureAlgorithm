package org.yyf.algorithm.stack;

import java.util.LinkedList;

/**
 * Created by tobi on 16-11-22. 除了正常的push和pop操作 设计一个可以得到当前栈中最小数的方法 这道题的关键是要用一个ｓｔａｃｋ去实时记录ｓｔａｃｋ当前的最小值.
 * 这种解法stackMin中存比栈顶值大的数的时候存当前ｔｏｐ值。
 */
public class GetMinStack2 {
    private LinkedList<Integer> stackContainer = new LinkedList();
    private LinkedList<Integer> stackMin = new LinkedList();

    public static void main(String[] args) {
        GetMinStack2 stack = new GetMinStack2();
        Integer[] integers = new Integer[]{1, 0, 2, 4, 1, -1, 3};
        for (int i = 0; i < integers.length; i++) {
            stack.push(integers[i]);
            System.out.println(stack.getMin());
        }
        System.out.println("－－－－－－－－－－－－－");
        for (int i = 0; i < integers.length; i++) {
            stack.pop();
            System.out.println(stack.getMin());
        }

    }

    public void push(Integer newElement) {
        stackContainer.push(newElement);
        Integer topMinValue = stackMin.peek();
        if (stackMin.isEmpty()) {
            stackMin.push(newElement);
        } else {
            if (topMinValue < newElement) {
                stackMin.push(stackMin.peek());
            } else if (topMinValue >= newElement) {
                stackMin.push(newElement);
            }
        }

    }

    public Integer pop() {
        Integer result = stackContainer.removeLast();
        Integer topMinValue = stackMin.peek();
        stackMin.pop();

        return result;
    }

    public Integer getMin() {
        return stackMin.peek();
    }


}
