package com.example.demo.exercise;

public class 二进制中1的个数 {
    public static void main(String args[]){
        long nn = -2147483648L;
        int res = 0;
        String binaryString = Long.toBinaryString(nn);
        if(nn < 0){
            int n1 = Long.toBinaryString(~(nn)).length();
            int n2 = binaryString.length();
            binaryString = binaryString.substring(n1>n2?n1-n2:n2-n1);
        }
        for(int i = 0; i< binaryString.length(); i++){
            if(binaryString.charAt(i)=='1'){
                res++;
            }
        }
        System.out.println(Long.toBinaryString(nn));
        System.out.println(Long.toBinaryString(~(nn)));
        System.out.println(res);
    }
}
