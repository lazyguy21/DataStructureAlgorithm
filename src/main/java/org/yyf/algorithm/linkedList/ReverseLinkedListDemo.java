package org.yyf.algorithm.linkedList;

import org.yyf.algorithm.linkedList.domain.Node;

/**
 * Created by tobi on 2016/12/6.
 */
public class ReverseLinkedListDemo {
    public static Node reverse(Node head) {
        Node curPtr = head.next;
        Node prePtr = head;
        prePtr.next=null;
        Node temp;
        while (curPtr != null) {
            temp = curPtr.next;
            curPtr.next = prePtr;

            prePtr = curPtr;
            curPtr = temp;
        }
        return prePtr;
    }

    public static void main(String[] args) {
        Node head = Node.getDefaultNodeList(0,1);
        head = reverse(head);
        System.out.println(head);


    }
}
