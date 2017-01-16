package org.yyf.algorithm.linkedList;

import org.yyf.algorithm.linkedList.domain.Node;

import java.util.Objects;

/**
 * Created by tobi on 2016/11/25.
 * 传入一个单链表\双链表，删除指定的倒数第K个节点
 */
public class DeleteCountDownNodeDemo {
    public static void deleteCountDownKNodeFromSingleNodeList(Node head, int k) {
        if (head == null || k < 1) {
            return;
        }
        int count = 0;
        Node pointerBeyond = head;
        while (pointerBeyond != null) {
            k--;
            pointerBeyond = pointerBeyond.next;
        }

        if (k > 0) {
            //说明该链表没有那么长，do nothing
        }
        if (k == 0) {
            //头结点即为倒数第K个节点
            head = head.next;
        }
        if (k < 0) {
            pointerBeyond = head;
            while (k != -1) {
                pointerBeyond = pointerBeyond.next;
                k++;
            }
            pointerBeyond.next = pointerBeyond.next.next;
        }
    }

    public static void deleteCountDownKNodeFromSingleNodeList2(Node head, int k) {
        if (head == null || k < 1) {
            return;
        }
        int length = 1;
        Node tempPtr = head;
        while (tempPtr.next != null) {
            tempPtr = tempPtr.next;
            length++;
        }
        tempPtr = head;
        for (int i = 0; i < length - k - 1; i++) {
            tempPtr = tempPtr.next;
        }
        tempPtr.next = tempPtr.next.next;



    }

    /**
     * 快慢指针
     * @param head
     * @param k
     */
    public static void slowFast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
            //todo
        }
        if (fast == null) {
            head = head.next;
            System.out.println(head);
            return;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        System.out.println(head);

    }

    public static void main(String[] args) {
        Node headNoe = Node.getDefaultNodeList(1, 2, 3, 4, 5, 6);

//        deleteCountDownKNodeFromSingleNodeList(headNoe, 3);
//        deleteCountDownKNodeFromSingleNodeList2(headNoe, 3);
        slowFast(headNoe,6);
    }
}
