package com.example.demo.算法;

public class 最大公约数 {
    //辗转相除法，欧几里得
    public static void main(String args[]){
        System.out.println(f(8,4));
        System.out.println(ff(8,4));
    }
    public static int f(int a, int b){
        if(b==0){
            return a;
        }else{
            return f(b, a % b);
        }
    }


    public static int ff(int a, int b){
        if(b==0){
            return a;
        }else{
            return ff(b, a % b);
        }
    }
}
