package com.example.demo.learn.Thread;

public class 原来的创建线程 {
    public static synchronized void test(){

        System.out.println("正在执行同步方法,当前线程"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行Thread线程1");
                test();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread线程1结束");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始执行Thread线程2");
                test();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread线程2结束");
            }
        }).start();

//        new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("开始执行Runnable线程3");
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("Runnable线程3结束");
//            }
//        }.run();
        System.out.println("主线程执行完毕");
    }
}
