package com.example.demo.算法学习日志.时间20200913;
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class 树的子结构 {
}
///**
//public class TreeNode {
//    int val = 0;
//    TreeNode left = null;
//    TreeNode right = null;
//
//    public TreeNode(int val) {
//        this.val = val;
//
//    }
//
//}
//*/
//import java.util.*;
//public class Solution {
//   public boolean HasSubtree(TreeNode root1,TreeNode root2) {
//        if(root1==null || root2==null){
//            return false;
//        }
//        ArrayList<TreeNode>one = new ArrayList<>();
//         ArrayList<TreeNode>two = new ArrayList<>();
//
//        qian(root1,one);
//        qian(root2,two);
//        int j = 0;
//        for(int i = 0; i < one.size(); i++){
//            if(one.get(i).val==two.get(j).val){
//                j++;
//                if(j==two.size()){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public void qian(TreeNode root,ArrayList<TreeNode>one){
//        if(root==null){
//            return;
//        }
//        one.add(root);
//        qian(root.left,one);
//        qian(root.right,one);
//    }
//
//    public TreeNode find(TreeNode root1,TreeNode root2){
//        if(root1==null){
//            return null;
//        }
//        if(root1==root2){
//            return root1;
//        }
//        TreeNode r1 = find(root1.left,root2);
//        if(r1!=null){
//            return root1;
//        }
//         TreeNode r2 = find(root1.right,root2);
//        if(r2!=null){
//            return root1;
//        }
//        return null;
//    }
//}