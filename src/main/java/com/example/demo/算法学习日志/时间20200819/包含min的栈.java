package com.example.demo.算法学习日志.时间20200819;

import java.util.Stack;

public class 包含min的栈 {
    public static void main(String args[]){
        Stack stack = new Stack();
        stack.push(1);

    }
}
//import java.util.Stack;
//
//public class Solution {
// Stack<Integer> stack = new Stack<Integer>();
//     Stack<Integer> min = new Stack<Integer>();
//    public void push(int node) {
//       if((stack.empty() && min.empty()) || min.peek() > node){
//           min.push(node);
//       }
//       stack.push(node);
//    }
//
//    public void pop() {
//        int node = stack.pop();
//        if(node==min.peek()){
//            min.pop();
//        }
//    }
//
//    public int top() {
//       return stack.peek();
//    }
//
//    public int min() {
//       return min.peek();
//    }
//}
