package com.example.demo.one;

import java.util.Arrays;
import java.util.Collections;

public class two {
    public static void main(String args[]){
        String s = null;
        three t = new three();
        t.setB(t.getA());
        t.setC(s);
        System.out.println(t.getB());
        System.out.println(t.getC());

        String str = "abcdefg\n";
        System.out.println(str.substring(1));
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(0, 0));

        System.out.println(str.replace("\n","").toCharArray());
        char a[] =  str.replace("\n","").toCharArray();
        Arrays.sort(a);
       System.out.println(a);
       if(a.length==1){

       }
    }
}
