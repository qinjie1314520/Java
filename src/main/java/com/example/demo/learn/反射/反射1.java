package com.example.demo.learn.反射;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class 反射1 {
    public static void main(String args[]) throws NoSuchFieldException {
        Class cla = 反射1.class;
        System.out.println(cla);
        System.out.println(反射1.class);

        Class cla1 = User.class;

        System.out.println(cla1.getName());
        System.out.println(cla1.getPackage());

        Method[] methods = cla1.getDeclaredMethods();
//        Arrays.stream(methods).forEach(System.out::println);

        Field name = cla1.getDeclaredField("name");
        name.setAccessible(true);
//        System.out.println(name.get);

    }
}

