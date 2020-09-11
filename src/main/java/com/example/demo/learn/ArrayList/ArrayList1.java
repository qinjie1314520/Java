package com.example.demo.learn.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>(2);
        list.size();
        //list添加后可以重复,在ArrayList->AbstractList->AbstractCollection。
        // AbstractCollection方法重写了String，让list返回[1, 1, 1]
        list.add(1);
        list.add(1);
        list.add(1);
        //[1, 1, 1]
        System.out.println(list.toString());
        Integer a = new Integer(2);
        list.add(a);
        list.add(a);
        list.add(a);
        //[1, 1, 1, 2, 2, 2]
        System.out.println(list.toString());

    }
}
