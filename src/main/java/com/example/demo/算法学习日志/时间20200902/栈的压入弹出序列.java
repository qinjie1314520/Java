package com.example.demo.算法学习日志.时间20200902;

import java.util.Stack;
//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）


//链接：https://www.nowcoder.com/questionTerminal/d77d11405cc7470d82554cb392585106
//来源：牛客网
//
//入栈1,2,3,4,5
//
//出栈4,5,3,2,1
//
//首先1入辅助栈，此时栈顶1≠4，继续入栈2
//
//此时栈顶2≠4，继续入栈3
//
//此时栈顶3≠4，继续入栈4
//
//此时栈顶4＝4，出栈4，弹出序列向后一位，此时为5，,辅助栈里面是1,2,3
//
//此时栈顶3≠5，继续入栈5
//
//此时栈顶5=5，出栈5,弹出序列向后一位，此时为3，,辅助栈里面是1,2,3
public class 栈的压入弹出序列 {
    public static void main(String args[]) {

    }

    Stack<Integer> stack = new Stack<Integer>();
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int bb[] = popA;
        int aa[] = pushA;
        int a = 1;
        int b = 0;
        stack.push(aa[0]);
        while (!stack.empty()) {
            if (stack.peek() == bb[b]) {
                b++;
                stack.pop();
            } else {
                if (a == aa.length) {

                    break;
                }
                stack.push(aa[a++]);
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;

    }


}
