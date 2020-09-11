package com.example.demo.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Test17 {
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] nex = in.nextLine().split(" ");
        BigInteger num[] = new BigInteger[n];
        for(int i = 0; i < n; i++){
            num[i] = new BigInteger(nex[i]);
        }
        int res = 0;
        for(int i = 1; i< num.length-1; i++){
            BigInteger max = new BigInteger("0");
            BigInteger max1 = new BigInteger("0");
            BigInteger min = new BigInteger("0");
            BigInteger min1 = new BigInteger("0");
            for(int j = 0; j < i; j++){
                if(num[j].compareTo(num[i])==1){
                    max = num[j];
                    if(max1.compareTo(new BigInteger("0"))==0){
                        max1 = max;
                    }
                    if(max1.compareTo(max)==1){
                        max1 = max;
                    }
                }
            }
            for(int j = i+1; j < num.length; j++){
                if(num[i].compareTo(num[j])==1){
                    min = num[j];
                    if(min.compareTo(new BigInteger("0"))==0){
                        min1 = min;
                    }
                    if(min1.compareTo(min)==-1){
                        min1 = min;
                    }
                }
            }
            if(max.compareTo(new BigInteger("0"))==1 && min.compareTo(new BigInteger("0"))==1 ){
                if(max1.mod(min1).compareTo(new BigInteger("0"))==0){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
