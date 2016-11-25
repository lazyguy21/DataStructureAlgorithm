package org.yyf.algorithm.linkedList.domain;

/**
 * Created by tobi on 2016/11/25.
 * 打印2个有序链表的公共部分
 */
public class PrintCommonDemo {
    public static void main(String[] args) {
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, node1);
        Node node3 = new Node(3, node2);


        Node nodes0 = new Node(0, null);
        Node nodes1 = new Node(1, nodes0);
        Node nodes4 = new Node(4, nodes1);

        printCommon(node3,nodes4);
    }

    public static void printCommon(Node aHead, Node bHead) {
        if (aHead.data > bHead.data) {
            printCommon(aHead.next,bHead);
        }else if(aHead.data<bHead.data){
            printCommon(aHead,bHead.next);
        }else {
            System.out.println(aHead.data);
        }

    }
}
