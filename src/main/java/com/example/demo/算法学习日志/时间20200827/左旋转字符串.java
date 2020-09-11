package com.example.demo.算法学习日志.时间20200827;

public class 左旋转字符串 {
    public static void main(String args[]){
        String str = "abcXYZdef";
        int k = 3;
        int kk = k % str.length();

        String s = str.substring(k,str.length())+""+str.substring(0,kk);
        System.out.println(s);
    }
}

//public class Solution {
//    public String LeftRotateString(String str,int n) {
//        if(str==null || str.length()==0){
//            return "";
//        }
//        if(n <= 0){
//            return str;
//        }
//        int kk = n % str.length();
//        if(kk==0){
//            return str;
//        }
//        String s = str.substring(n,str.length())+""+str.substring(0,kk);
//        return s;
//    }
//}
