package com.example.demo.exercise;
import java.util.Scanner;

public class Test4{
    public static void main(String args[]){
        try{
            Scanner in = new Scanner(System.in);
            String[] tmp1=  in.nextLine().split(" ");
            Integer N = Integer.parseInt(tmp1[0]);
            Integer T = Integer.parseInt(tmp1[1]);
            String str = in.nextLine();
            String tmp2;
            while((tmp2 = in.nextLine())!=null && !tmp2.equals("")){
                String[] tmp3 = tmp2.split(" ");
                Integer TYPE = Integer.parseInt(tmp3[0]);
                Integer x = Integer.parseInt(tmp3[1]);
                if(TYPE==1){
                    String tmp4 = str.substring(0,x-1);
                    String tmp5 = str.substring(x,str.length()-1);
                    str=tmp5+""+tmp4;
                }else if(TYPE==2){
                    System.out.println(str.substring(x, x+1));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
