package com.example.demo.算法学习日志.时间20200823;

import java.util.ArrayList;

public class 链表中倒数第k个节点 {
    public static void main(String args[]){
        String s = "asdasd";
        s = s+100;
        s += "    a";

    }
    public void 链表中倒数第k个N节点(){}
}
///*
//public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}*/
//import java.util.ArrayList;
//public class Solution {
//    public ListNode FindKthToTail(ListNode head,int k) {
//        if(head==null){
//            return head;
//        }
//        if(k == 0){
//            return null;
//        }
//        ArrayList<ListNode> a = new ArrayList<ListNode>();
//        while(head!=null){
//            a.add(head);
//            head = head.next;
//        }
//        if(a.size()-k < 0){
//            return null;
//        }
//        return a.get(a.size()-k);
//    }
//}



// public ListNode FindKthToTail(ListNode head,int k) {
//        ListNode p = head;
//        ListNode q = head;
//        int i = 0;
//        for(;p!=null;i++){
//            if(i>=k){
//                q = q.next;
//            }
//            p = p.next;
//        }
//        return i<k?null:q;
//    }
