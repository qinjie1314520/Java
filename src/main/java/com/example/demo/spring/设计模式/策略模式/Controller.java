package com.example.demo.spring.设计模式.策略模式;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private HanderFactory handerFactory;
    @GetMapping("/strategy/test")
    public void test(String type){
        handerFactory.getHandler(type).handleSubmit();
    }
}
