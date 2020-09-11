package com.example.demo.learn.线程;

import java.util.concurrent.Callable;

public class 创建线程 {
    public static void main(String args[]) throws Exception {
        //one
//        Thread thread = new Thread();
//        thread.start();

        //two
//        new Runnable(){
//
//            @Override
//            public void run() {
//
//            }
//        };

        //three
        new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(1500);
                return "call";
            }
        }.call();
//        System.out.println(s);
        System.out.println("结束");

    }
}
