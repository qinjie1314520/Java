package com.example.demo.springboot.controller;

import com.example.demo.springboot.service.TestService;
import com.example.demo.springboot.cglib代理.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @GetMapping("test")
    public void Test(){
        testService.test();
    }
    @GetMapping("test1")
    public String Test1(){
        return ""+testService.test1();
    }
    @GetMapping("test1_1")
    public String test1_1(){
        return testService.test1_1()+"";
    }
    @GetMapping("test2")
    public void Test2() throws Exception {
        testService.test2();
    }
    @GetMapping("test2_1")
    public void test2_1(){
        testService.test2_1();
    }


    @GetMapping("test3")
    public void Test3() throws Exception {
        testService.test3();
    }
    @GetMapping("test3_1")
    public void Test3_1(){

        testService.test3_1();
    }


    @GetMapping("test4")
    public void Test4() throws Exception {
        testService.test4();
    }
    @GetMapping("test4_1")
    public void Test4_1(){

        testService.test4_1();
    }


    @GetMapping("aop")
    public void aop(){
        testService.aop();
        System.out.println(testService.getClass());
    }

    @Autowired
    private Person testService1;
    @GetMapping("aop1")
    public void aop1(){
        testService1.sayHello("asd");
        System.out.println(testService1.getClass());
    }
}
