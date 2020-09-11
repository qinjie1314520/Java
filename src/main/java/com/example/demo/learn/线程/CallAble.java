package com.example.demo.learn.线程;

import javafx.concurrent.Task;

import java.util.concurrent.*;

public class CallAble {
    public static void main(String args[]){
        //创建线程池
        ExecutorService executor = Executors.newCachedThreadPool();
        //创建Callable对象任务
        Callable task = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("子线程指向");
                return "asd" ;
            }
        };
        //提交任务并获取执行结果
        Future<Integer> result = (Future<Integer>) executor.submit(task);


        System.out.println("主线程在执行任务");
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e1) {
//            e1.printStackTrace();
//        }
        try {
            if(result.get()!=null){
                System.out.println("task运行结果"+result.get());
            }else{
                System.out.println("未获取到结果");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
        //关闭线程池
        executor.shutdown();

    }
}
