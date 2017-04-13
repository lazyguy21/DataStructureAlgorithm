package org.yyf.algorithm.leetcode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/#/description
 * Created by tobi on 2017/4/13.
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode21 = new ListNode(3);

        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode21;

        ListNode result = deleteDuplicates(listNode);
        System.out.println(result);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode ap = head;
        ListNode bp = head.next;
        while (ap != null) {
            if (bp == null) {
                ap.next = null;
                break;
            }
            if (ap.val != bp.val) {
                ap.next = bp;
                ap = bp;
                bp = bp.next;
            } else {
                bp = bp.next;
            }
        }
        return head;
    }
}
