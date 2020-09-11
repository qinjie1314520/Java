package com.example.demo.算法学习日志.时间20200816;

import java.util.Stack;

public class 二叉树的镜像 {
    public static void main(String args[]){
        int aa[] = {8, 6, 9, 5, 7, 7, 5};
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(6);
        TreeNode c = new TreeNode(9);
        TreeNode d = new TreeNode(5);
        TreeNode e = new TreeNode(7);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;



//        System.out.println(isSymmetrical(a));
        System.out.println( pre1(a));
        pre(a);
        System.out.println( pre1(a));
    }


    static boolean isSymmetrical(TreeNode pRoot)
    {

        TreeNode r = pre(pRoot);
        if(pre1(r).equals(pre1(pRoot)))
            return true;
        return false;
    }

    public static TreeNode pre(TreeNode pRoot){
        if(pRoot==null){
            return null;
        }
        TreeNode t = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = t;
        pre(pRoot.left);
        pre(pRoot.right);
        return pRoot;
    }
    public static String pre1(TreeNode pRoot){
        if(pRoot==null){
            return "";
        }

        return pRoot.val+""+pre1(pRoot.left)+pre1(pRoot.right);
    }

}

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
