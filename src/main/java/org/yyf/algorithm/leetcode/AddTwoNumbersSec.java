package org.yyf.algorithm.leetcode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/add-two-numbers-ii/#/description
 * Created by tobi on 2017/4/12.
 */
public class AddTwoNumbersSec {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(7);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode21 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode21;

        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(4);
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode newNode = addTwoNumbers(listNode, listNode3);
        System.out.println(newNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<ListNode> stack1 = new LinkedList<>();
        LinkedList<ListNode> stack2 = new LinkedList<>();
        while (l1 != null) {
            stack1.push(l1);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2);
            l2 = l2.next;
        }

        ListNode current = new ListNode(0);
        ListNode n1 = stack1.pop();
        ListNode n2 = stack2.pop();
        int high = 0;
        while (n1 != null || n2 != null || high != 0) {
            int sum = (n1 == null ? 0 : n1.val) + (n2 == null ? 0 : n2.val) + high;
            current.val = sum%10;

            high = sum / 10;
            ListNode head = new ListNode(high);
            head.next = current;
            current = head;

            n1 = stack1.poll();
            n2 = stack2.poll();
        }
        return current.val == 0 ? current.next : current;
    }
}
