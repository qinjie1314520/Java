package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test27 {
    private static List<Integer> res = new ArrayList<>();
    private static int a = 0;
    private static int b = 0;
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = 4;
        int m = 4;
        int num[][] = new int[n][m];
        //总数
        int sum = 0;
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                num[i][j] = in.nextInt();
                sum += num[i][j];
            }
        }

        for(int i = 43/16; i > 0; i--){

        }
    }
    public static void test(int num[][], int sum0){
        int sum = 0;
        for(int i =0; i < num.length; i++){
            for(int j = 0; j < i; j++){

            }
                if(sum == sum0){
                    a = i;
                    return;
                }
        }
    }

}
