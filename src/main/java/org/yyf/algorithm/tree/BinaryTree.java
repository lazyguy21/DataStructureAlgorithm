package org.yyf.algorithm.tree;

import java.util.AbstractCollection;
import java.util.Objects;

public class BinaryTree<T> {
    private Node<T> root;   //根节点

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    /*二叉树的节点*/
    private static class Node<T> {
        T element;  //节点的值
        Node<T> lchild, rchild; //左右孩子节点

        public Node(T element, Node<T> lchild, Node<T> rchild) {
            this.element = element;
            this.lchild = lchild;
            this.rchild = rchild;
        }

        public T getElement() {
            return element;
        }

        public Node setElement(T element) {
            this.element = element;
            return this;
        }

        public Node<T> getLchild() {
            return lchild;
        }

        public Node setLchild(Node<T> lchild) {
            this.lchild = lchild;
            return this;
        }

        public Node<T> getRchild() {
            return rchild;
        }

        public Node setRchild(Node<T> rchild) {
            this.rchild = rchild;
            return this;
        }
    }

    /**
     * 先序遍历
     * @param root
     */
    public void preOrder(Node<T> root){
        if(root!=null){
            System.out.print(root.getElement());
            preOrder(root.getLchild());
            preOrder(root.getRchild());
        }
    }

    /**
     * 中序遍历
     * @param root
     */
    public void midOrder(Node<T> root){
        if(root!=null){
            midOrder(root.getLchild());
            System.out.print(root.getElement());
            midOrder(root.getRchild());
        }
    }
    public void postOrder(Node<T> root){
        if(root!=null){
            postOrder(root.getLchild());
            postOrder(root.getRchild());
            System.out.print(root.getElement());
        }
    }

    /*main方法用于测试*/
    public static void main(String[] args) {
//        A
//      B   C
//     D E F G
//
//        前序遍历:ABDECFG
//        中序遍历:DBEAFCG
//        后序遍历:DEBFGCA
        Node<String> D = new Node<>("D", null, null);
        Node<String> E = new Node<>("E", null, null);
        Node<String> F = new Node<>("F", null, null);
        Node<String> G = new Node<>("G", null, null);

        Node<String> lchild = new Node<>("B", D, E);
        Node<String> rchild = new Node<>("C", F, G);

        Node<String> root = new Node<>("A", lchild, rchild);

        BinaryTree<String> binaryTree = new BinaryTree<String>(root);
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.midOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
    }
}