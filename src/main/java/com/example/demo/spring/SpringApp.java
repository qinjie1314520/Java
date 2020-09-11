package com.example.demo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");
        HelloWorld hello = (HelloWorld) applicationContext.getBean("hello");
        hello.sayHello();
        applicationContext.close();
    }
}
