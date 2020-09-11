package com.example.demo.算法学习日志.时间20200810;

import java.util.Scanner;

//有一座高度是n级台阶的楼梯，从下往上走
//跨一步只能向上1级或者2级台阶。要求用程序来求出一共有多少种走法。
public class 台阶问题 {
    public static void main(String argsp[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        System.out.println(test(n));

    }

    public static int test(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 2;
        }
        return test(n - 1) + test(n - 2);

    }
}
