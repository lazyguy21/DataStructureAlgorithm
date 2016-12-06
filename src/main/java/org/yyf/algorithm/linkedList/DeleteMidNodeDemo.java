package org.yyf.algorithm.linkedList;

import org.yyf.algorithm.linkedList.domain.Node;

/**
 * Created by tobi on 2016/12/6.
 * 删除中央节点
 * 快慢指针法
 */
public class DeleteMidNodeDemo {
    public static Node deleteMidNode(Node head) {
        if(head==null||head.next==null)return head;
        if (head.next.next == null) {
            return head.next;
        }
        Node slow=head;
        Node fast=head.next;
        Node preSlow=null;
        while (fast!=null&&fast.next != null) {
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preSlow.next = preSlow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = Node.getDefaultNodeList(0,1,2,3);
        head = deleteMidNode(head);
        System.out.println(head);


    }
}
