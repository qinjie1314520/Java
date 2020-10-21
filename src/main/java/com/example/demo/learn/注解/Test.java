package com.example.demo.learn.注解;

import java.util.Arrays;

@Annotation1(value = "类")
public class Test {
    @Annotation1(value = "方法")
    public void test(@Annotation1(value = "方法中形参上") String name){

    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class cla = new Test().getClass();
        //得到类注解
       System.out.println(cla.getAnnotations().length);
       //得到方法注解
       System.out.println(cla.getMethod("test",String.class).getAnnotations().length);
       //得到变量注解
       System.out.println(cla.getMethod("test",String.class).getParameters()[0].getAnnotations().length);

    }
}
