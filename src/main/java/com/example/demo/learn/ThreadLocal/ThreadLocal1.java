package com.example.demo.learn.ThreadLocal;

import org.apache.poi.ss.formula.functions.T;

public class ThreadLocal1 {
    static final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    public static void main(String args[]){


//        for(int i = 0; i < 10; i++){
//            new Thread(new Runnable(){
//                @Override
//                public void run() {
//                    final ThreadLocal<String> threadLocal = new ThreadLocal<String>();
//        threadLocal.set("hello world");
//                    System.out.println(threadLocal.get());
//                }
//            }).start();
//        }
        ThreadLocal<String> threadLocal1 = new ThreadLocal<String>();
        System.out.println(threadLocal.get());
        threadLocal.set("hello");
        System.out.println(threadLocal.get());

        threadLocal.set("helloasdasdas");
        System.out.println("threadLocal1:"+threadLocal1.get());

    }
}
