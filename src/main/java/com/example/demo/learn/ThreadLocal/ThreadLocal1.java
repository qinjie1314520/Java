package com.example.demo.learn.ThreadLocal;

import org.apache.poi.ss.formula.functions.T;

public class ThreadLocal1 {
    public static void main(String args[]){
        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        System.out.println(threadLocal.get());
        threadLocal.set("hello");
        System.out.println(threadLocal.get());
        System.out.println(threadLocal.get());

        threadLocal.set("helloasdasdas");
        System.out.println(threadLocal.get());

    }
}
