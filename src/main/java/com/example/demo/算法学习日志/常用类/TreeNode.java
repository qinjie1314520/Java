package com.example.demo.算法学习日志.常用类;

public class TreeNode {
    public int val = 0;
    public TreeNode left = null;
    public TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
    public static TreeNode getInstance(){
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(15);
        treeNode.right = new TreeNode(20);

        treeNode.left.left = new TreeNode(30);
        treeNode.left.right = null;

        treeNode.right.left = new TreeNode(100);
        treeNode.right.right = new TreeNode(101);
        return treeNode;
    }
}
