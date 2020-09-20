package com.example.demo.learn.代理.CGLIB代理;

public class UserServiceImpl implements UserService {

    public String getName(int id) {
        System.out.println("------getName------");
        return "cat";
    }

    public Integer getAge(int id) {
        System.out.println("------getAge------");
        return 10;
    }
}

