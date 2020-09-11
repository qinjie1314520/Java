package com.example.demo.算法;

import java.util.Scanner;

//给你六种面额的纸币 {1、5、10、20、50、100元}，
// 假设每种币值的数量都足够多，编写程序求组成 N 元（N为 0-10000 的非负整数）的不同组合的个数。
public class 钱币组合从上到下 {
    private static int num[] = {1, 5, 10, 20, 50, 100};

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int i = 0;
        for (i = 5; i >= 0; i--) {
            if (num[i] <= N) {
                break;
            }
        }
        System.out.println(f(i, N));

    }

    private static int f(int i, int sum) {
        if (i == -1) {
            return 0;
        }
        if (sum <= 0) {
            return 1;
        }
        int res = 0;

        //选i
        if (sum >= num[i]) {
            res += f(i, sum - num[i]);
        }
        //不选i
        res += f(i - 1, sum);
        return res;
    }
}
