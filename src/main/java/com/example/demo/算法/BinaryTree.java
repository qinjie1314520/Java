package com.example.demo.算法;

import java.util.List;

public class BinaryTree {
    public static void main(String args[]) {
        BinaryTree root = createSimpleTree();

        preorderTraversal(root);
        System.out.println();
        inorderTraversal(root);
        System.out.println();
        postorderTraversal(root);
    }

    Integer val;
    /**
     * 左子树
     */
    BinaryTree left;
    /**
     * 右子树
     */
    BinaryTree right;

    public BinaryTree(Integer val) {
        this.val = val;
    }

    public static BinaryTree createSimpleTree() {
        BinaryTree root = new BinaryTree(0);
        BinaryTree leftOne = new BinaryTree(1);
        BinaryTree leftTwo = new BinaryTree(2);
        BinaryTree leftThree = new BinaryTree(3);
        BinaryTree leftFour = new BinaryTree(4);
        root.left = leftOne;
        leftOne.left = leftTwo;
        leftTwo.left = leftThree;
        leftThree.left = leftFour;


        BinaryTree rightOne = new BinaryTree(5);
        BinaryTree rightTwo = new BinaryTree(6);
        BinaryTree rightThree = new BinaryTree(7);
        BinaryTree rightFour = new BinaryTree(8);
        root.right = rightOne;
        rightOne.right = rightTwo;
        rightTwo.right = rightThree;
        rightThree.right = rightFour;
        return root;
    }

    //前序遍历
    public static void preorderTraversal(BinaryTree root) {
        System.out.print(root.val+" ");
        if (root.left != null) {
            preorderTraversal(root.left);
        }
        if (root.right != null) {
            preorderTraversal(root.right);
        }
    }
    //中序遍历
    public static void inorderTraversal(BinaryTree root) {
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        System.out.print(root.val+" ");
        if (root.right != null) {
            inorderTraversal(root.right);
        }
    }
    //后续遍历
    public static void postorderTraversal(BinaryTree root) {
        if (root.left != null) {
            postorderTraversal(root.left);
        }
        if (root.right != null) {
            postorderTraversal(root.right);
        }
        System.out.print(root.val+" ");
    }
}

