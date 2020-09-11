package com.example.demo.算法;

import java.util.Scanner;

//小明同学学习了不同的进制之后，拿起了一些数字做起了游戏。小明同学知道，在日常生活中我们最常用的是十进制数，而在计算机中，二进制数也很常用。现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。 f(x)表示把x这个数用十进制写出后各个数位上的数字之和。如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后各个数位上的数字之和。如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 小明同学发现对于一些正整数x满足f(x)=g(x)，他把这种数称为幸运数，现在他想知道，大于0且小于等于n的幸运数有多少个？
//输入描述:
//每组数据输入一个数n(n<=100000)
//输出描述:
//每组数据输出一行，小于等于n的幸运数个数。
//示例1
//输入
//复制
//21
//输出
//复制
//3
public class 幸运数 {
    public static void main(String args[]){
        int res = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            //计算十进制时的值
            int sum10 = 0;
            int sum2 = 0;
            //保存初始值
            //转化为字符
            String nnS = Integer.valueOf(i).toString();
            for(int j = 0; j < nnS.length(); j++){
                sum10 += Integer.valueOf(nnS.charAt(j) + "");
            }

            //保存初始二进制
            String nnS1 = Integer.toBinaryString(i);
            for(int j = 0; j < nnS1.length(); j++){
                sum2 += Integer.valueOf(nnS1.charAt(j) + "");
            }
            if(sum10==sum2){
                res++;
            }
        }

    }
}
