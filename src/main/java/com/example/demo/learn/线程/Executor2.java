package com.example.demo.learn.线程;

import java.util.concurrent.*;

public class Executor2 {
    public static void main(String args[]) throws InterruptedException {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 7
                , 5L, TimeUnit.SECONDS, new ArrayBlockingQueue(10), Executors.defaultThreadFactory());
        ExecutorService executorService = (ExecutorService)threadPoolExecutor;
        for(int i = 0; i < 20; i++){
            threadPoolExecutor.execute(()->{
                System.out.println(threadPoolExecutor.getActiveCount()+"开始"+Thread.currentThread().getName());
            });
        }

        //异步通知
//        executorService.submit(new Callable<Object>() {
//        })

        Thread.sleep(15000);
        System.out.println(threadPoolExecutor.getActiveCount());
        System.out.println(threadPoolExecutor.getCorePoolSize());
        System.out.println(threadPoolExecutor.getPoolSize());
    }
}
