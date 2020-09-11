package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 斐波那契数列 {
    public static void main(String args[]){

    }
    class Solution {
        public int[] fn;
        public int Fibonacci(int n) {
            fn = new int[n+1];
            for(int i = 0; i <= n; i++){
                if(i==0 || i == 1){
                    fn[i]=i;
                }else{
                    fn[i] = fn[i - 1] + fn[i - 2];
                }
            }
            return fn[n];
        }
    }
}
