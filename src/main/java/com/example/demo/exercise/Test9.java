package com.example.demo.exercise;

import java.util.Scanner;

public class Test9 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(rev(rev(x)+rev(y)));
    }
    public static int rev(int x){
        String tmp = x+"";
        char [] tmp1 = tmp.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = tmp1.length-1;i>=0; i--){
            stringBuilder.append(tmp1[i]);
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
