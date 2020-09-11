package com.example.demo.算法学习日志.时间20200821;

    import java.util.ArrayList;

public class 二叉树的下一个节点 {
    public static void main(String args[]){

    }
///*
//public class TreeLinkNode {
//    int val;
//    TreeLinkNode left = null;
//    TreeLinkNode right = null;
//    TreeLinkNode next = null;
//
//    TreeLinkNode(int val) {
//        this.val = val;
//    }
//}
//*/
//import java.util.ArrayList;
//public class Solution {
//    ArrayList<TreeLinkNode>all = new ArrayList<TreeLinkNode>();
//    public TreeLinkNode GetNext(TreeLinkNode pNode)
//    {
//
//        if(pNode==null){
//            return null;
//        }
//        TreeLinkNode p = pNode, root = parent(pNode);
//        zhong(root);
//        for(int i = 0; i < all.size(); i++){
//            if(all.get(i)==p){
//                if(i+1 == all.size()){
//                    return null;
//                }
//                return all.get(i+1);
//            }
//        }
//        return null;
//    }
//
//    public TreeLinkNode parent(TreeLinkNode root){
//        while(root.next!=null){
//            root = root.next;
//        }
//
//        return root;
//    }
//    public void zhong(TreeLinkNode root){
//        if(root==null){
//            return;
//        }
//        zhong(root.left);
//        all.add(root);
//        zhong(root.right);
//    }
//}
}
