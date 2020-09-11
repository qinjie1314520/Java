package com.example.demo.learn;

import java.math.BigDecimal;
import java.math.BigInteger;

public class HashCode {
    public static void main(String args[]){
        //整形的HashCode就是它本身的值
        //2
        System.out.println(new Integer(2).hashCode());
        //1074580685
        System.out.println(new Float(2.2).hashCode());
        //565749536
        System.out.println(new Double(2.45452).hashCode());
        //654564665
        System.out.println(new Long((long)654564665).hashCode());
        //387416105
        System.out.println(new BigInteger("152454545454545").hashCode());
        //2029855160
        System.out.println(new BigDecimal(2.22625665).hashCode());
    }
}
