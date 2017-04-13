package org.yyf.algorithm.leetcode;

import java.util.List;

/**
 * Created by tobi on 2017/4/13.
 */
public class MergeSortList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode21 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode21;

        ListNode result = sortList(listNode);
        System.out.println(result);
    }
    public static ListNode sortList(ListNode head) {
        if(head==null||head.next==null)return head;
        //用快慢指针，找出中点，切分成2个链表
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next=null;
        //递归排序左右2个链表，返回左右链表头
        ListNode leftNode = sortList(head);
        ListNode rightNode = sortList(slow);
        ListNode dummyNode = new ListNode(0);
        ListNode ptr = dummyNode;
        //合并

        while (leftNode!=null&&rightNode!=null){
            if (leftNode.val <= rightNode.val) {
                ptr.next = leftNode;
                ptr = ptr.next;
                leftNode = leftNode.next;
            } else {
                ptr.next = rightNode;
                ptr = ptr.next;
                rightNode = rightNode.next;
            }
        }
        if (leftNode!=null){
            ptr.next = leftNode;
        }
        if (rightNode != null) {
            ptr.next = rightNode;
        }
        return dummyNode.next;
    }
}
