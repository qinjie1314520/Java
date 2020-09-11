package com.example.demo.算法学习日志.时间20200810;
//输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
public class 二叉树的深度 {


//    public class Solution {
//        public int TreeDepth(TreeNode root) {
//            if(root==null){
//                return 0;
//            }
//            if(root.left==null && root.right != null){
//                return 1+TreeDepth(root.right);
//            }else if(root.left!=null && root.right==null){
//                return 1+TreeDepth(root.left);
//            }else if(root.left!=null && root.right!=null){
//                int left = 1+TreeDepth(root.left);
//                int rigth = 1+TreeDepth(root.right);
//                return left>rigth?left:rigth;
//            }else{
//                return 1;
//            }
//        }
//    }
}
