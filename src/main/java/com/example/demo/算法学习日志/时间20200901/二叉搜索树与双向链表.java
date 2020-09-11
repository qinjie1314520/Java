package com.example.demo.算法学习日志.时间20200901;

import java.util.ArrayList;

public class 二叉搜索树与双向链表 {
    public static void main(String args[]){

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
//import java.util.ArrayList;
//public class Solution {
//    public TreeNode Convert(TreeNode pRootOfTree) {
//        ArrayList<TreeNode> datas = new ArrayList<TreeNode>();
//        zhong(datas,pRootOfTree);
//        if(datas.size() >= 2){
//
//
//        datas.get(0).left = null;
//        datas.get(0).right = datas.get(1);
//        for(int i = 1; i < datas.size()-1; i++){
//            datas.get(i).left = datas.get(i-1);
//            datas.get(i).right = datas.get(i+1);
//        }
//        datas.get(datas.size()-1).left = datas.get(datas.size()-2);
//        datas.get(datas.size()-1).right = null;
//        return datas.get(0);
//        }else if(datas.size() == 1){
//            datas.get(0).left = null;
//            datas.get(0).right = null;
//            return datas.get(0);
//        }
//            return null;
//
//    }
//     public static void zhong(ArrayList<TreeNode> datas,TreeNode root){
//        if(root==null){
//            return;
//        }
//        zhong(datas,root.left);
//        datas.add(root);
//        zhong(datas, root.right);
//    }
//}

}
