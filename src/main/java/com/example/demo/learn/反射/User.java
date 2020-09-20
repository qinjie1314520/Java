package com.example.demo.learn.反射;

public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    static {
        System.out.println("静态代码块");
    }
    public User(){
        System.out.println("构造方法");
    }
    {
        System.out.println("动态代码块");
    }


}
