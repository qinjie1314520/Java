package com.example.demo.算法;

import java.util.Scanner;

//* 题目描述：
// * 给出一个整数n，将n分解为至少两个整数之和，使得这些整数的乘积最大化，输出能够获得的最大的乘积。
// * 例如：
// * 2=1+1.输出1
// * 10=3+3+4，输出36.
// * 输入描述：输入为1个整数
// * 输出描述：输出为1个整数
// * 例如：输入10，输出36
//有一定的数据原理在里面，这里不做证明，优先拆分为3.
public class 乘积最大化 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==1){
            System.out.println(0);
        }
        if(n==2){
            System.out.println(1);
        }
        if(n==3){
            System.out.println(2);
        }
        if(n==4){
            System.out.println(4);
        }
        int res = 1;
        while(n>4){
            res *= 3;
            n-=3;
        }
        System.out.println(res*n);
    }
}
