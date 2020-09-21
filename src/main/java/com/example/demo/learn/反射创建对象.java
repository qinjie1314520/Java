package com.example.demo.learn;

import com.example.demo.learn.继承.Parent;

import java.lang.reflect.InvocationTargetException;

public class 反射创建对象 {
    public static void main(String args[]) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Parent parent = new Parent(4);
        Class cla = Parent.class;
        Parent parent1 = (Parent) cla.getDeclaredConstructor(Integer.class).newInstance(10);

    }

}
