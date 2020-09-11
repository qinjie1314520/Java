package com.example.demo.算法;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 数列的和 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String tmp[] = in.nextLine().split(" ");
            double n = Double.valueOf(tmp[0]);
            int m = Integer.valueOf(tmp[1]);
            double res = 0;
            for(int i = 1; i <= m; i++){
                res += n;
                n = Math.sqrt(n);
            }
            System.out.printf("%.2f\n", res);
        }
    }
}
