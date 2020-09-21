package com.example.demo.learn.代理.CGLIB代理;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class UserServiceImpl implements UserService {

    @Override
    public String getName(int id) {
        System.out.println("------getName------");
        return "cat";
    }

    @Override
    public Integer getAge(int id) {
        System.out.println("------getAge------");
        return 10;
    }

    public static void main(String args[]){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "G:\\");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(new Test().getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("before");
            return methodProxy.invokeSuper(
                    o, objects
            );
        });
        ((Test) enhancer.create()).test();
    }
}

