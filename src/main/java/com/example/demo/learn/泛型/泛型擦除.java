package com.example.demo.learn.泛型;

import java.util.ArrayList;
import java.util.List;

//泛型类和泛型方法public <T> T genericMethod(T t)
public class 泛型擦除<T> {
    T a;
    public 泛型擦除(T aa){
        a = aa;
    }
    public T getA(){
        return a;
    }
    public <E> void show_3(E t){
        System.out.println(t.toString());
    }


    public static void main(String args[]){
        泛型擦除<Integer> test = new 泛型擦除<Integer>(10);
        System.out.println(test.getA().getClass());



        //泛型擦除
        List<String> l = new ArrayList<String>();
        List<Integer> la = new ArrayList<Integer>();
        System.out.println(l.getClass()==la.getClass());
    }
}
