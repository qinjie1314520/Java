package com.example.demo.learn.线程;

import java.util.concurrent.*;

public class Executor1 {
    public static void main(String args[]){

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 15
                , 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(10), Executors.defaultThreadFactory());

        for(int i = 0; i < 10; i++){
            threadPoolExecutor.execute(()->{
                System.out.println("开始");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("结束");

            });
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadPoolExecutor.getTaskCount());
        System.out.println(threadPoolExecutor.getActiveCount());
    }
}
