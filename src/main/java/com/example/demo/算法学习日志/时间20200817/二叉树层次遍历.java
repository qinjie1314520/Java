package com.example.demo.算法学习日志.时间20200817;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class 二叉树层次遍历 {
    public static void main(String args[]){
        LinkedList arrayQueue = new LinkedList();
        arrayQueue.offer(1);
        arrayQueue.offer(11);
        arrayQueue.offer(111);
        arrayQueue.offer(2);
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
        System.out.println(arrayQueue.poll());
    }
}
//import java.util.ArrayList;
//
//import java.util.LinkedList;
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
//public class Solution {
//    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//        LinkedList<TreeNode> stack = new LinkedList();
//        ArrayList<Integer> a = new ArrayList<>();
//        if(root==null){
//            return a;
//        }
//        stack.offer(root);
//        while(stack.size()!=0){
//            TreeNode aa = stack.poll();
//            a.add(aa.val);
//
//            if(aa.left!=null){
//                stack.offer(aa.left);
//            }
//            if(aa.right!=null){
//                stack.offer(aa.right);
//            }
//        }
//        return a;
//    }
//}
