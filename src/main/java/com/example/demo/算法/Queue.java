package com.example.demo.算法;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Integer> list = new ArrayList<>(16);

    public void push(Integer n) {
        list.add(n);
    }

    public Integer top() {
        return list.size() == 0 ? -1 : list.get(0);
    }

    public Integer pop() {
        Integer re = list.size() == 0 ? -1 : list.get(0);
        if (re != -1) {
            list.remove(0);
        }
        return re;
    }

    public Integer size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }
}
