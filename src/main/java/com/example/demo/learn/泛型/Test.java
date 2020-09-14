package com.example.demo.learn.泛型;

public class Test<T> {
    T a;
    public Test(T aa){
        a = aa;
    }

    public T getA(){
        return a;
    }

    public static void main(String args[]){
        Test test = new Test(10);
        System.out.println(test.getA().getClass());

    }
}
