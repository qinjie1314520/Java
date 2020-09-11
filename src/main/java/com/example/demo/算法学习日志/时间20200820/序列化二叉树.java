package com.example.demo.算法学习日志.时间20200820;

import com.example.demo.算法学习日志.常用类.TreeNode;

public class 序列化二叉树 {
    public static void main(String args[]){
//        TreeNode treeNode = TreeNode.getInstance();
//        String s = Serialize(treeNode);
//        System.out.println(s);
//        System.out.println(Serialize(Deserialize(s)));
    }
   ///*
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
    //public class Solution {
    //    int j = 0;
    //    String Serialize(TreeNode root) {
    //        if(j==0 && root==null){
    //            return "";
    //        }
    //        if(root==null){
    //            return "#";
    //        }
    //        j++;
    //        return root.val+","+Serialize(root.left)+","+Serialize(root.right);
    //  }
    //
    //    TreeNode Deserialize(String str) {
    //        if(str==null || str.length() <= 0){
    //            return null;
    //        }
    //        s = str.split(",");
    //        if(s.length == 0){
    //            return null;
    //        }
    //        TreeNode t=  new TreeNode(Integer.valueOf(s[0]));
    //        te(t);
    //        return t;
    //    }
    //         int i = 1;
    //     String s[];
    //     TreeNode te(TreeNode t){
    //        if(i==s.length){
    //            t.left = null;
    //            t.right = null;
    //            return null;
    //        }
    //        if(s[i].equals("#")){
    //            t.left = null;
    //            i++;
    //        }else{
    //            t.left = new TreeNode(Integer.valueOf(s[i]));
    ////            System.out.println(t.val);
    //            i++;
    //            te(t.left);
    //        }
    //        if(s[i].equals("#")){
    //            t.right = null;
    //            i++;
    //        }else{
    //            t.right = new TreeNode(Integer.valueOf(s[i]));
    //            i++;
    //            te(t.right);
    //        }
    //        return t;
    //    }
    //}
}
