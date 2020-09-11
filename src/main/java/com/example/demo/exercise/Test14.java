package com.example.demo.exercise;

import java.util.*;

public class Test14 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        while(in.hasNextLine()){
            String str = in.nextLine();
            if(str!=null && !str.equals("")){
                String str1[] = str.split(" ");
                StringBuilder stringBuilder = new StringBuilder();
                for(int i = str1.length-1; i>=0; i--){
                    stringBuilder.append(str1[i]+" ");
                }
                System.out.println(stringBuilder.toString());
            }
        }

    }


}
