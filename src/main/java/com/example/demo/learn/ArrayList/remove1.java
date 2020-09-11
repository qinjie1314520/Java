package com.example.demo.learn.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class remove1 {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(null);
        System.out.println(list.size());
    }
}
