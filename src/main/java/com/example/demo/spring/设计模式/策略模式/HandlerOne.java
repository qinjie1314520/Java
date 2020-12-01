package com.example.demo.spring.设计模式.策略模式;

import org.springframework.stereotype.Component;

@Component
public class HandlerOne implements HandlerInterface {
    @Override
    public String getType() {
        return "one";
    }

    @Override
    public Object handleSubmit() {
        System.out.println("策略模式：one");
        return null;
    }
}
