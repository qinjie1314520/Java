package com.example.demo.面试.代理.静态代理;

public aspect TxAspect {
    void around():call(void com.example.demo.面试.代理.静态代理.Hello.sayHello()){
        System.out.println("开始事务 ...");
        proceed();
        System.out.println("事务结束 ...");
    }
}
