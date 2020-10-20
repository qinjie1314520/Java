package com.example.demo.learn.泛型;


import java.util.List;

public class 泛型擦除1 {
//    public String test(List<String> a){
//return "";
//    }
//
//    public Integer test(List<Integer>a){
//        return 0;
//    }

    private static <T extends Number> double add(T a, T b) {
        System.out.println(a + "+" + b + "=" + (a.doubleValue() + b.doubleValue()));
        return a.doubleValue() + b.doubleValue();
    }

    private static <T extends Number> double aa(T a){
        return a.doubleValue();
    }

}
