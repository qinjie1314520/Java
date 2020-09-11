package com.example.demo.算法学习日志.时间20200831;

public class 复杂链表的复制 {
    public static void main(String args[]){

    }
}
///*
//public class RandomListNode {
//    int label;
//    RandomListNode next = null;
//    RandomListNode random = null;
//
//    RandomListNode(int label) {
//        this.label = label;
//    }
//}
//*/
//public class Solution {
//    public RandomListNode Clone(RandomListNode pHead)
//    {
//        if(pHead == null){
//            return null;
//        }
//         RandomListNode randomListNode = pHead;
//        //首先复制节点，不管随机节点
//        RandomListNode head = randomListNode;
//        while(randomListNode!=null){
//            RandomListNode n = new RandomListNode(randomListNode.label);
//            RandomListNode c = randomListNode.next;
//            randomListNode.next = n;
//            n.next = c;
//            randomListNode = c;
//        }
//        randomListNode = head;
//        //然后复制随机节点
//        while(randomListNode!=null){
//            randomListNode.next.random = randomListNode.random==null?null:randomListNode.random.next;
//            randomListNode = randomListNode.next.next;
//        }
//        //拆分得到复制的节点
//
//RandomListNode currentNode = pHead;
//        RandomListNode pCloneHead = pHead.next;
//        while(currentNode != null) {
//            RandomListNode c = currentNode.next;
//            currentNode.next = c.next;
//            c.next = c.next==null?null:c.next.next;
//            currentNode = currentNode.next;
//        }
//        return pCloneHead;
//    }
//}
