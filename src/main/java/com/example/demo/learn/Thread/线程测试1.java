package com.example.demo.learn.Thread;

public class 线程测试1 {
    public static void main(String args[]) {
        Thread1 thread = new Thread1();
        Thread thread1 = new Thread(thread);
        Thread thread2 = new Thread(thread);
        Thread thread3 = new Thread(thread);
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("主线程执行完毕");
    }
    static class Thread1 implements Runnable{
        private int i = 10;
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+":"+i--);
        }
    }
}
