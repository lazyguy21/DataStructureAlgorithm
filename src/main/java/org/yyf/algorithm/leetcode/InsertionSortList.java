package org.yyf.algorithm.leetcode;

/**
 * Created by tobi on 2017/4/13.
 */
public class InsertionSortList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode21 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode21;
        ListNode listNode3 = insertionSortList(listNode);
        System.out.println(listNode3);
    }
    public static ListNode insertionSortList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        ListNode prePointer = dummyHead;

        ListNode candidate = head;
        ListNode nextCandidate =null;
        while (candidate!= null){
            nextCandidate = candidate.next;
            while (prePointer.next!=null&&candidate.val<prePointer.next.val){
                prePointer = prePointer.next;
            }

            candidate.next = prePointer.next;
            prePointer.next = candidate;

            prePointer = dummyHead;
            candidate = nextCandidate;
        }
        return dummyHead.next;
    }

}
