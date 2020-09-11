package com.example.demo.learn.Integer;

public class Integer1 {
    public static void main(String args[]){
        //int为4字节，32位，1位符号位，31位数字位
        //最大当是31位全1，即2^31-1 = 2147483647
        //2^31为负数最小 -2147483648
        int a = (1 << 31)-1;
        int b = (1 << 31) + ((1 << 31) - 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.MAX_VALUE);
    }
}
