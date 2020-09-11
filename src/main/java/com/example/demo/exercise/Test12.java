package com.example.demo.exercise;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test12 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            String str[] = in.nextLine().split(" ");
            try{
                BigInteger big1 = new BigInteger(str[0]);
                BigInteger big2 = new BigInteger(str[1]);
                BigInteger sum = big1.add(big2);
                System.out.println(sum.toString());
            }catch(Exception e){
                System.out.println("Error");
            }
        }
    }

}
