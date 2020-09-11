package com.example.demo.算法;

import java.util.Scanner;
//一个数组有 N 个元素，求连续子数组的最大和。 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
//输入描述:
//输入为两行。 第一行一个整数n(1 <= n <= 100000)，表示一共有n个元素 第二行为n个数，即每个元素,每个整数都在32位int范围内。以空格分隔。
//输出描述:
//所有连续子数组中和最大的值。
//示例1
//输入
//复制
//3 -1 2 1
//输出
//复制
//3
public class 连续最大和 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[] = new int[n];
        //保存数据
        for(int i = 0; i < n; i++){
            num[i] = in.nextInt();
        }
        int max = num[0];
        int res = 0;
       for(int i = 0; i < n; i++){
           if(res>0){
               res += num[i];
           }else{
               res = num[i];
           }
           if(res > max){
               max = res;
           }
           if(res < num[i]){
               res=0;
           }
       }
        System.out.println(max);
    }

}
