package com.example.demo.learn.Thread;

public class 重入锁 {
    static class a{
        //可重入锁，悲观锁
        synchronized void test(){
            System.out.println("test1");
            test2();
        }
        synchronized void test2(){
            System.out.println("test2");
        }
    }
    public static void main(String args[]) {
       a aa = new a();
       aa.test();

    }

}
