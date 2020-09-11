package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test28 {
    public static void main(String args[]) {

        String s[] = {"asd", "aa"};
        System.out.println(s.toString());
    }
    public static String get(String str, String replace){
        StringBuilder stringBuilder = new StringBuilder();
        char[] a = str.toCharArray();
        for(int i = 0; i < a.length; i++){
            if(a[i]==' '){
                stringBuilder.append(replace);
            }else{
                stringBuilder.append(a[i]);
            }
        }
        return stringBuilder.toString();
    }

}
