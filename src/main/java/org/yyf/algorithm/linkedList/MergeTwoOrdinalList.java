package org.yyf.algorithm.linkedList;

import org.yyf.algorithm.linkedList.domain.Node;

/**
 * Created by tobi on 2016/12/27.
 * 合并2个有序的链表为一个有序的链表
 */
public class MergeTwoOrdinalList {
    public static void main(String[] args) {
        Node node1 = Node.getDefaultNodeList(0,1,24,33,44,51,64,70);
        Node node2 = Node.getDefaultNodeList(0,1,2,3,4,5,6,7);
        Node head = merge(node1, node2);
        System.out.println(head);
    }
    public static Node merge(Node node1, Node node2) {

        Node head;
        Node currentNew;
        Node current1;
        Node current2;
        if (node1.data < node2.data) {
            head = node1;
            current1 = node1.next;
            current2 = node2;
        } else {
            head = node2;
            current1 = node1;
            current2 = node2.next;
        }
        currentNew = head;

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                currentNew.next = current1;
                current1 = current1.next;
                currentNew = currentNew.next;
            } else {
                currentNew.next = current2;
                current2 = current2.next;
                currentNew = currentNew.next;
            }

        }
        while (current1!=null){
            currentNew.next=current1;
            currentNew = currentNew.next;
            current1 = current1.next;
        }
        while (current2!=null){
            currentNew.next=current2;
            currentNew = currentNew.next;
            current2 = current2.next;
        }
        return head;
    }
}
