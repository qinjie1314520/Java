package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test30 {
    public static void main(String args[]){
        int a[] = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> re = new ArrayList<>(4);
        Arrays.stream(a).sorted().limit(4).forEach(x->re.add(x));
        System.out.println(re);
    }
}
