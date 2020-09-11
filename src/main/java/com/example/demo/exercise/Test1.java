package com.example.demo.exercise;

import java.util.Scanner;
//    给出一个正整数N和长度L，找出一段长度大于等于L的连续非负整数，他们的和恰好为N。答案可能有多个，我我们需要找出长度最小的那个。
//    例如 N = 18 L = 2：
//            5 + 6 + 7 = 18
//            3 + 4 + 5 + 6 = 18
//    都是满足要求的，但是我们输出更短的 5 6 7

//通过方程计算基数，就是第一个数，然后循环100次看从最短的出发，那一次等于总数
public class Test1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String[] str = in.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int l = Integer.parseInt(str[1]);
        int x;
        int sum = 0;
        for(int i = l; i<= 100; i++){
            sum=0;
            x = (n-i*i/2+i/2 )/i;
            System.out.println(x);
            if(x < 0){
                break;
            }
            for(int j = 0; j < i; j++){
                sum +=x+j;
            }
            if(sum == n){
                String res = "";
                for(int j = 0; j < i; j++){
                    res+=x+j+" ";
                }
                System.out.println(res.substring(0, res.length()-1));
                break;
            }
            if(i==100){
                System.out.println("No");
            }
        }
    }
}
