package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Test31 {
    public static void main(String args[]){
        int a[] = {1,2,4,7,3,5,6,8};
        int a1[] = {4,7,2,1,5,3,8,6};
        reConstructBinaryTree(a, a1);
    }
    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if(pre.length==0 && in.length==0){
            return null;
        }else if(pre.length==0 && in.length!=0){
            TreeNode node1 = null;
            TreeNode node2 = null;
            TreeNode node3 = null;
            if(in.length==2){
                node1 = new TreeNode(in[0]);
                node2 = new TreeNode(in[1]);
                node1.right = node2;
            }else if(in.length==3){
                node1 = new TreeNode(in[1]);
                node2 = new TreeNode(in[0]);
                node3 = new TreeNode(in[2]);
                node1.left = node2;
                node1.right = node3;
            }else if(in.length==1){
                node1 =new TreeNode(in[0]);
            }
            return node1;
        }
        else if(pre.length!=0 && in.length==0){
            TreeNode node1 = null;
            TreeNode node2 = null;
            TreeNode node3 = null;
            if(pre.length==2){
                node1 = new TreeNode(pre[0]);
                node2 = new TreeNode(pre[1]);
                node1.right = node2;
            }else if(pre.length==3){
                node1 = new TreeNode(pre[1]);
                node2 = new TreeNode(pre[0]);
                node3 = new TreeNode(pre[2]);
                node1.left = node2;
                node1.right = node3;
            }else if(pre.length==1){
                node1 = new TreeNode(pre[0]);
            }
            return node1;
        }
        int pre1[] = new int[pre.length];
        int in1[] = new int[in.length];
        int i = 0;
        for(i = 0; i < in.length; i++){
            if(pre[0]==in[i]){
                break;
            }else{
                pre1[i] = pre[i+1];
                in1[i] = in[i];
            }
        }
        System.out.println(pre1.length);
        System.out.println(in1.length);
        TreeNode nodeLeft = reConstructBinaryTree(pre1, in1);

        TreeNode re = new TreeNode(in[i]);
        re.left = nodeLeft;
        int pre2[] = new int[pre.length];
        int in2[] = new int[in.length];
        for(i = i+1; i < in.length; i++){
            pre2[i] = pre[i];
            in2[i] = in[i];
        }

        TreeNode nodeRight = reConstructBinaryTree(pre2, in2);
        re.left = nodeRight;
        try {

        }catch (Exception e){
            e.printStackTrace();
        }
        return re;
    }

}
  class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }

