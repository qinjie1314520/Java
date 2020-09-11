package com.example.demo.算法;

import java.util.Scanner;
//题目描述：从非负整数序列0,1,2，….，n中给出包含其中n个数的子序列，请找出未出现在该子序列中的那个数。
//输入描述：输入为n+1个非负整数，用空格分开。
//其中：首个数字为非负整数序列的最大值n，后面n个数字为子序列中包含的数字。
//输出描述：输出为1个数字，即未出现在子序列中的那个数。
//示例：
//输入：
//3 3 0 1
//输出：
//2
//————————————————
//版权声明：本文为CSDN博主「Violet-Zhao」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/Demodan/article/details/79888460
public class 序列找树 {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n>=0){
            StringBuilder s = new StringBuilder();
            for(int i = 0 ; i < n; i++){
                s.append(in.nextInt());
            }
            for(int i =0 ;i <= n; i++){
                if(!s.toString().contains(""+i)){
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
