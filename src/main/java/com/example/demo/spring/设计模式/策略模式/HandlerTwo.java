package com.example.demo.spring.设计模式.策略模式;

import org.springframework.stereotype.Component;

@Component
public class HandlerTwo implements HandlerInterface {
    @Override
    public String getType() {
        return "two";
    }

    @Override
    public Object handleSubmit() {
        System.out.println("策略模式：two");
        return null;
    }
}
