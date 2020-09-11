package com.example.demo.算法学习日志.时间20200820;

import java.util.LinkedList;

public class 把二叉树打印成多行 {
    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();
        linkedList.offer(1);
        System.out.println(linkedList.poll());
        System.out.println(linkedList.poll());
        System.out.println(linkedList.size());
    }
}
//import java.util.ArrayList;
//
//
//import java.util.LinkedList;
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
//    LinkedList<TreeNode> queue1 = new LinkedList<TreeNode>();
//    LinkedList<TreeNode> queue2 = new LinkedList<TreeNode>();
//    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
//        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
//        queue1.offer(pRoot);
//        TreeNode p;
//        while(queue1.size()!=0 || queue2.size()!=0){
//            ArrayList<Integer> one = new ArrayList<>();
//
//            while((p = queue1.poll())!=null){
//                one.add(p.val);
//                if(p.left!=null){
//                    queue2.offer(p.left);
//                }
//                if(p.right!=null){
//                    queue2.offer(p.right);
//                }
//            }
//            if(one.size()!=0){
//                res.add(one);
//            }
//
//             ArrayList<Integer> two = new ArrayList<>();
//            while((p = queue2.poll())!=null){
//                two.add(p.val);
//                if(p.left!=null){
//                    queue1.offer(p.left);
//                }
//                if(p.right!=null){
//                    queue1.offer(p.right);
//                }
//            }
//            if(two.size()!=0){
//                res.add(two);
//            }
//        }
//        return res;
//    }
//
//}
