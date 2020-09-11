package com.example.demo.面试.代理.关于代理部分的研究;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDK动态代理 {
    public static void main(String args[]){
        One one = new One();
       Two two = (Two) Proxy.newProxyInstance(one.getClass().getClassLoader(), one.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before");;

                return method.invoke(one,args);
            }
        });
       two.say();
    }
    static class One implements Two{
        @Override
        public void say(){
            System.out.println("hello jdk动态代理");
        }
    }
    static interface Two{
        void say();
    }



}
