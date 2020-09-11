package com.example.demo.jvm;

import java.util.ArrayList;
import java.util.List;
//-XX:+HeapDumpOnOutOfMemoryError -Xms20m -Xmx20m
public class 内存溢出 {
    public static void main(String args[]) throws InterruptedException {
        List<test> list = new ArrayList<>();
        Thread.sleep(10000);
        for(int i = 0; i< 10000; i++){
            Thread.sleep(100);
            list.add(new test());
        }
    }
    static class test{
        //非局部变量不会被内存回收装置干掉
        public test(){
            //局部变量会被清除
        byte[] b= new byte[1024*128];

        }
    }
}
