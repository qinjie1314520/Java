package com.example.demo.exercise;

import java.util.Scanner;

public class Test10 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer res = 0;
        for(int i = 1; i <= n; i++){
            res += f(i);
        }
        System.out.println(res);

    }
    public static int f(int x){
        int max = 1;
        if(max%2==1){
            return x;
        }
        for(int i = 1; i <= x/2; i++){
            if(x%i==0){
                if(i%2==1){
                    if(max < i){
                        max = i;
                    }
                }
            }
        }
        return max;
    }
}
