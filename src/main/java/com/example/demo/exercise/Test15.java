package com.example.demo.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class Test15 {
    public static void main(String args[]) {
       try{
           Scanner in = new Scanner(System.in);
           while (in.hasNextInt()) {
               int totalNum = in.nextInt();
               BigInteger num[] = new BigInteger[totalNum];
               for (int i = 0; i < num.length; i++) {
                   num[i] = new BigInteger(in.nextInt()+"");
               }

               for(int i = 0; i < num.length -1; i++){
                   for(int j = 1+i; j < num.length; j++){
                       if(new BigInteger(num[i]+""+num[j]).compareTo(new BigInteger(num[j]+""+num[i]))<0){
                           BigInteger tmp = num[i];
                           num[i] = num[j];
                           num[j] = tmp;
                       }
                   }
               }
               StringBuilder stringBuilder = new StringBuilder();
               for(int i = 0 ; i < num.length; i++){
                   stringBuilder.append(num[i].toString());
               }
               System.out.println(Integer.valueOf(stringBuilder.toString()));
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
