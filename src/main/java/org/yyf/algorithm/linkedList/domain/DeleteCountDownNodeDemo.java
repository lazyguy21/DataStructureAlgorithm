package org.yyf.algorithm.linkedList.domain;

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
        Node pointerBeyond=head;
        while(pointerBeyond!=null){
            k--;
            pointerBeyond = pointerBeyond.next;
        }

        if(k>0){
            //说明该链表没有那么长，do nothing
        }
        if(k==0){
            //头结点即为倒数第K个节点
            head = head.next;
        }
        if(k<0){
            pointerBeyond=head;
            while (k!=-1){
                pointerBeyond = pointerBeyond.next;
                k++;
            }
            pointerBeyond.next = pointerBeyond.next.next;
        }
    }

    public static void main(String[] args) {
        Node headNoe = Node.getDefaultNodeList(1, 2, 3, 4, 5, 6);

        deleteCountDownKNodeFromSingleNodeList(headNoe, 3);
        System.out.println(headNoe);
    }
}
