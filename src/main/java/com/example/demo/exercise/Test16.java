package com.example.demo.exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Test16 {
    public static void main(String args[]) {
       try{
           Scanner in = new Scanner(System.in);
           String ins = in.nextLine();
           HashMap<Character, Integer> count = new HashMap<Character, Integer>();
           char tmp1[] = ins.toCharArray();
           for(int i = 0; i < tmp1.length; i++){
               Object ob = count.get(tmp1[i]);
               if(ob==null){
                   count.put(tmp1[i], 1);
               }else{
                   Integer re = (Integer)ob+1;
                   if(re >= 3 && ((tmp1[i]>='a' && tmp1[i]<='z') || tmp1[i]>='A' && tmp1[i]<='Z')){
                       System.out.println(tmp1[i]);
                       break;
                   }else{
                       count.put(tmp1[i], re);
                   }
               }
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
