package com.example.demo.exercise;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = n; //用来记录被选到数加起来的总和
        while (max >= 0) {
            int re = 0;
            String res = "";//用来记录被选到的数
            for (int i = max; i > 0; i--) {
                if (re + i <= m) {
                    re += i;
                    res += i + " ";
                }
                if (re == m) {
                    StringBuilder s = new StringBuilder();
                    String res1[] = res.trim().split(" ");
                    for(int j = 0; j < res1.length; j++){
                        s.append(res1[res1.length-1-j]+" ");
                    }
                    System.out.println(s.toString().trim());
                    break;
                }
            }
            max--;
        }
    }
}
