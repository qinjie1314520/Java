package com.example.demo.exercise;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static void main(String args[]){
       try{
           Scanner scanner = new Scanner(System.in);
           String[] input = scanner.nextLine().split(" ");
           int l = Integer.parseInt(input[0]);
           int r = Integer.parseInt(input[1]);
           //1 12 123 1234 12345 123456
           List<BigInteger>list = new ArrayList<BigInteger>();
           String s = "";
           int totalNum = 0;
           for(int i = 1; i <= r; i++){
               s+=i;
               list.add(new BigInteger(s));
           }
           for(int i = l-1; i < list.size(); i++){
               if(list.get(i).mod(new BigInteger("3")).equals(new BigInteger("0"))){
                   totalNum++;
               }
           }
           System.out.println(totalNum);
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
