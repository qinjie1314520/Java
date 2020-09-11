package com.example.demo.算法学习日志.时间20200822;

import java.util.HashMap;
import java.util.HashSet;

public class 删除链表中重复的节点 {
    public static void main(String args[]){
        HashMap map = new HashMap();
    }
}
///*
// public class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
//*/
//import java.util.HashMap;
//public class Solution {
//    public ListNode deleteDuplication(ListNode pHead)
//    {
//        if(pHead==null){
//            return null;
//        }
//        if(pHead.next== null){
//            return pHead;
//        }
//        HashMap map = new HashMap();
//        ListNode l = pHead;
//        while(l.next!=null){
//            if(l.val == l.next.val){
//                l.next = l.next.next;
//                map.put(l,"");
//            }else{
//                l = l.next;
//            }
//        }
//         ListNode l1 = pHead,l2=null;
//        while(l1!=null){
//            if(map.get(l1)==null){
//                l2 = l1;
//            }else{
//                if(l2==null){
//                    pHead = pHead.next;
//
//                }else{
//                     l2.next = l1.next;
//
//                }
//
//            }
//            l1 = l1.next;
//        }
//        return pHead;
//    }
//}
