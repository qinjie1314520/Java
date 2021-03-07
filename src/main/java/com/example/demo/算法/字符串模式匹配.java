package com.example.demo.算法;

import java.util.Scanner;

public class 字符串模式匹配 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String p = in.nextLine();
        String t = in.nextLine();

        String s = "a*b";
        System.out.println(test(s,"ab"));
    }

    public static int test(String model, String target){
        int i = 0, j = 0;

        while(i < model.length() && j < target.length()){
            if(model.charAt(i) == '*'){
                if(i+1>=model.length()){
                    //标识最后一个为*
                    return 1;
                }
                else if(model.charAt(i+1)=='*'){
                    //如果下一个还是*
                    i++;
                }
                else{
                    //不是最后一个
                    if(model.charAt(i+1)==target.charAt(j)){
                        //标识*后面的匹配上当前目标串的字符
                        i+=2;
                    }
                        j++;
                }
            }else if(model.charAt(i) == '?'){
                i++;
                j++;
            }else{
                if(model.charAt(i)==target.charAt(j)){
                    i++;
                    j++;
                }else{
                    return 0;
                }
            }
        }
        if(j==target.length() && i < model.length()){
            //标识目标串先走完
            return 0;
        }
        return 1;

    }
}
