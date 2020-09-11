package com.example.demo.exercise;

import java.util.*;


public class Test20 {
    public static void main(String args[]) {
//            System.out.println(8 ^ 9);
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            int num[] = new int[n];
            int jj = 0;
            while(in.hasNextInt()){
                num[jj] = in.nextInt();
                jj++;
            }
            Arrays.sort(num);
            int res = 0;
            for(int i = 0; i < n; i++){
                for(int j = i; j < n; j++){
                    if(((num[i]^num[j]) > m)){
                        res++;
                    }
                }
            }
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
