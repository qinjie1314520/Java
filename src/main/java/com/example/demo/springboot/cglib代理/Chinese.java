package com.example.demo.springboot.cglib代理;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements Person {

    @Timer
    @Override
    public String sayHello(String name) {
        System.out.println("-- sayHello() --");
        return name + " hello, AOP";
    }

    public void eat(String food) {
        System.out.println("我正在吃：" + food);
    }

}
