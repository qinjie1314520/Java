package com.example.demo.exercise;


import java.math.BigInteger;
import java.util.Scanner;

//输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
public class Test24 {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            int str = in.nextInt();
            int res = 0;
            BigInteger sum = new BigInteger("1");
            for(int i = 1; i <= str; i++){
                sum = sum.multiply(new BigInteger(i+""));
                while(sum.toString().endsWith("0")){
                    res++;
                    sum = new BigInteger(sum.toString().substring(0, sum.toString().length() - 1));
                }
            }
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
