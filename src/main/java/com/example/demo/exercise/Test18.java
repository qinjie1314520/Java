package com.example.demo.exercise;

import java.util.Scanner;

public class Test18 {
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int num[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                num[i][j] = in.nextInt();
            }
        }
        int total[] = new int[m];
        int res = 0;
        for(int i = 0; i < m; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                sum +=num[j][i];
            }
            if(res < sum){
                res = sum;
            }
        }
        System.out.println(res);
    }
}
