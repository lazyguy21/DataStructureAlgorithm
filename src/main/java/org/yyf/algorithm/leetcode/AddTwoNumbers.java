package org.yyf.algorithm.leetcode;

import java.util.List;

/**
 * https://leetcode.com/problems/add-two-numbers/#/description
 * Created by tobi on 2017/4/12.
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);
        listNode.next = listNode1;
        listNode1.next = listNode2;

        ListNode listNode3 = new ListNode(5);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(4);
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode newNode = addTwoNumbers(listNode, listNode3);
        System.out.println(newNode);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode currentNode=null;

        ListNode l1cur = l1;
        ListNode l2cur = l2;
        int counter = 0;
        int high = 0;
        while (l1cur != null || l2cur != null || high != 0) {
            int val1 = l1cur == null ? 0 : l1cur.val;
            int val2 = l2cur == null ? 0 : l2cur.val;

            int sum = val1 + val2 + high;
             high = sum / 10;
            int newValue = sum % 10;

            ListNode newNode= new ListNode(newValue);
            if (counter == 0) {
                head = newNode;
                currentNode = newNode;
            }else {
                currentNode.next = newNode;
                currentNode = currentNode.next;

            }
            counter++;

            l1cur = (l1cur == null) ? l1cur : l1cur.next;
            l2cur = (l2cur == null) ? l2cur : l2cur.next;


        }

        return head;


    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
