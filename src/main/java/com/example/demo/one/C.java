package com.example.demo.one;

import java.util.Scanner;

public class C {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum1(149));
//        int T = scanner.nextInt();
//
//
//        int d = scanner.nextInt();

//        System.out.println(sum(41));

    }
    public static int sum(int d){
        int sum = 0;
        int dd = d;
       for(int i = 0 ; i < (d+"").length(); i++){
        sum+=dd%10;
        dd = dd/10;
       }
        return sum;
    }

    public static int sum1(int d){
        if(d>100){
            int dd = d - 9;
            int re = 9 + dd%10;
            return re + sum1(dd/10);
        }else{
            if(d <= 10){
                return (d);
            }else{
                return(sum(d-9)+9);
            }
        }
    }
}
