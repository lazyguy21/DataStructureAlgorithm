package org.yyf.algorithm.linkedList.domain;

/**
 * Created by tobi on 2016/11/24.
 */

public class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return this.data + "," + this.next;
    }

    public static Node getDefaultNodeList(Integer... integers) {
        Node tempNext=null;
        for (int i = integers.length-1; i >=0; i--) {
            Integer integer = integers[i];
            Node node = new Node();
            node.data = integer;
            node.next=tempNext;

            tempNext = node;


        }
        return tempNext;
    }


    public static void main(String[] args) {
        Node headNode = Node.getDefaultNodeList(2, 31, 0, -1, 3, 10);
        System.out.println(headNode.toString());
    }


}
