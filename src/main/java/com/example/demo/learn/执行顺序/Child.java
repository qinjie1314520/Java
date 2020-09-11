package com.example.demo.learn.执行顺序;

public class Child extends Parent{
    public Child() {
        System.out.println("child  construct");
    }
    static {
        System.out.println("child  static");
    }

    public static void main(String args[]){
        new Child();
    }
}
