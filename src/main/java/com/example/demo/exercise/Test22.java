package com.example.demo.exercise;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//给定一个十进制的正整数number，选择从里面去掉一部分数字，希望保留下来的数字组成的正整数最大。
public class Test22 {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                char a[] = in.nextLine().toCharArray();
                int num = Integer.parseInt(in.nextLine());
                List<Integer>res = new ArrayList<>(a.length);
                for(int i = 0; i < a.length; i++){
                    res.add(Integer.parseInt(""+a[i]));
                }
                for(int i = 0; i < num; i++){
                    for(int j = 0; j <res.size()-1; j++){
                        if(res.get(j) < res.get(j+1)){
                            res.remove(j);
                            break;
                        }else if(j+1 == res.size()-1){
                            res.remove(j+1);
                            break;
                        }
                    }
                }
                for(int i = 0; i < res.size(); i++){
                    System.out.print(res.get(i));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
