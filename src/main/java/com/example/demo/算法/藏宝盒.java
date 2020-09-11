package com.example.demo.算法;

import java.util.Scanner;

public class 藏宝盒 {
//    public static void main(String args[]){
//        Scanner in = new Scanner(System.in);
//        String parent = in.nextLine();
//        String child = in.nextLine();
//        if(child.length()==0 || parent.length()==0){
//            System.out.println("Yes");
//        }
//        int i = 0;
//        while(i < child.length()){
//            if(-1==parent.indexOf("" + child.charAt(i))){
//                System.out.println("No");
//                return;
//            }
//            parent.replace(child.charAt(i)+"", "");
//            i++;
//        }
//        System.out.println("Yes");
//    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(sub(s1, s2));
    }

    public static String sub(String s1, String s2) {
        int i = 0,j = 0;
        int start = 0;
        while (start < s1.length()) {
            //s1从第start个元素开始找s2。因为子串可能从任意位置开始匹配
            j = start;
            i = 0;
            //开始匹配
            while (i < s2.length() && j < s1.length()) {
                if (s1.charAt(j) == s2.charAt(i)) {
                    i++;
                    j++;
                } else {
                    j++;
                }
            }
            start ++;
            if (i == s2.length()) {
                return "Yes";
            }
        }
        return "No";
    }
}
