package com.example.demo.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Test5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replaceFirst("\n", "");
        char[] tmp = str.toCharArray();
        Arrays.sort(tmp);
        int[] counts = new int[26];
        for(char t : tmp){
            counts[t-'a']++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(counts[i]!=0){
                stringBuilder.append((char)((int)'a'+i));
                stringBuilder.append(counts[i]);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
