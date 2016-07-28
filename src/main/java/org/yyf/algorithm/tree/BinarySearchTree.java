package org.yyf.algorithm.tree;

/**
 * Created by tobi on 16-7-28. 二叉搜索树
 */
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(Integer[] array) {
        root = new Node();
        root.data = 5;
        for (int i = 0; i < array.length; i++) {
            Integer integer = array[i];
            addNode(integer, root);
        }
    }

    public void addNode(Integer data, Node node) {
        Node candidate = new Node();
        candidate.data = data;
        if (data == node.data) return;
        if (data > node.data) {
            if (node.right == null) {
                node.right = candidate;
            } else {
                addNode(data, node.right);
            }

        } else if (data < node.data) {
            if (node.left == null) {
                node.left = candidate;
            } else {
                addNode(data, node.left);
            }
        }
    }


    /**
     * 先序遍历
     */
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }

    }

    private class Node {
        private Integer data;
        private Node left;
        private Node right;
    }

    public static void main(String[] args) {
        Integer[] arrays = {1, 2, 3, 4, 6, 7, 8, 9};
        BinarySearchTree tree = new BinarySearchTree(arrays);
        tree.preOrder(tree.root);

    }
}
