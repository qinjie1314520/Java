package com.example.demo.one;

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String args[]){
        Scanner in =  new Scanner(System.in);

        String s[]  = in.nextLine().split(" ");
        int n = Integer.valueOf(s[0]);
        int k = Integer.valueOf(s[1]);
        int vals[] = new int[n];
        for(int i = 0; i < n; i++){
            vals[i] = (in.nextInt());
            if(k-1!=i){
                System.out.print(vals[i]+" ");
            }
        }


    }
}
