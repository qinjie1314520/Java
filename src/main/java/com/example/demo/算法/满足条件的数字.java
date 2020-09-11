package com.example.demo.算法;

import java.util.Scanner;

//题目描述：
//如果一个正整数，它的质因数只包含2,3,5，那么这个数满足条件。
//同时，特别规定1也是满足条件的数字。
//示例：前10个满足条件的数字是1,2,3,4,5,6,8,9,10,12
//请编写一个函数，返回第n个满足条件的数
//输入描述：
//输入为n
//输出描述：
//输出为第n个满足条件的数
//示例：
//输入：
//5
//输出：
//5
//————————————————
//版权声明：本文为CSDN博主「Violet-Zhao」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/Demodan/article/details/79888460
public class 满足条件的数字 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if(n>=0){
            if(--n==0){
                System.out.println(1);
            }else{
                for(int i = 2;;i++ ){
                    if(i%2==0 || i% 3==0 || i%5==0){
                        n--;
                        if(n==0){
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        }
    }
}
