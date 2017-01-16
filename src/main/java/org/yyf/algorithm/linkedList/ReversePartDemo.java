package org.yyf.algorithm.linkedList;

import org.yyf.algorithm.linkedList.domain.Node;

/**
 * Created by tobi on 2016/12/7.
 */
public class ReversePartDemo {
    public static Node reversePart(Node head, int from, int to) {
        Node tempPtr = head;
        Node preFrom = null;
        Node postTo = null;
        int length = 0;
        while (tempPtr != null) {
            preFrom = length == from - 1 ? tempPtr : preFrom;
            postTo = length == to - 1 ? tempPtr : postTo;

            tempPtr = tempPtr.next;
            length++;
        }

        if (from > length || length < to) {
            return head;//范围溢出长度，不处理直接返回
        }

        Node currentNode = preFrom.next;
        Node after = null;
        currentNode.next = postTo;

        Node before = currentNode;
        currentNode = currentNode.next;
        while (currentNode != postTo) {
            after = currentNode.next;
            currentNode.next = before;
            before = currentNode;
            currentNode = after;
        }
        preFrom.next = currentNode;

        return head;

    }

    public static void main(String[] args) {
        Node head = Node.getDefaultNodeList(0,1,2,3,4,5,6,7);
        head = reversePart(head,2,4);
        System.out.println(head);


    }
}
