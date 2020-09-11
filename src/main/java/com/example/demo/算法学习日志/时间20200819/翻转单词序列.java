package com.example.demo.算法学习日志.时间20200819;

public class 翻转单词序列 {
    public static void main(String args[]){
        System.out.println(ReverseSentence(" "));
    }
    public static String ReverseSentence(String str) {
        String s[] = str.split(" ");
        if(s.length <= 1){
            return str;
        }
        StringBuilder ss = new StringBuilder();
        for(int i = s.length-1; i >= 0; i--){
            System.out.println(s[i]);
            ss.append(s[i]+" ");

        }
        return ss.substring(0,ss.length()-1);
    }
}
