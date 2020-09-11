package com.example.demo.算法;

import java.util.Arrays;
import java.util.Scanner;
//题目描述
//n 只奶牛坐在一排，每个奶牛拥有 ai 个苹果，现在你要在它们之间转移苹果，使得最后所有奶牛拥有的苹果数都相同，每一次，你只能从一只奶牛身上拿走恰好两个苹果到另一个奶牛上，问最少需要移动多少次可以平分苹果，如果方案不存在输出 -1。
//输入描述:
//每个输入包含一个测试用例。每个测试用例的第一行包含一个整数 n（1 <= n <= 100），接下来的一行包含 n 个整数 ai（1 <= ai <= 100）。
//输出描述:
//输出一行表示最少需要移动多少次可以平分苹果，如果方案不存在则输出 -1。
//示例1
//输入
//复制
//4
//7 15 9 5
//输出
//复制
//3
public class 分苹果 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        String nums[] = in.nextLine().split(" ");
        Integer num[] = new Integer[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            num[i] = Integer.valueOf(nums[i]);
            sum += num[i];
        }
        if(sum%n!=0){
            System.out.println(-1);
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if((sum/n-num[i])%2!=0){
                System.out.println(-1);
                return;
            }
        }
        int res = 0;
        while(true){
            Arrays.sort(num);
            if(num[num.length-1].equals(num[0])){
                break;
            }
            if(num[num.length-1]>=2){
                num[0] = num[0] + 2;
                num[num.length - 1] = num[num.length - 1] - 2;
                res++;
            }
        }
        System.out.println(res);

    }
}
