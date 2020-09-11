package com.example.demo.exercise;

import java.util.*;


public class Test21 {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);


            List<String> strs = new ArrayList<>(1000);
            long n = in.nextLong();
            long m = in.nextLong();
            for(long i = 1; i <= n; i++){
                strs.add(""+i);
            }
            Collections.sort(strs);
            System.out.println(strs.get((int)m-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
