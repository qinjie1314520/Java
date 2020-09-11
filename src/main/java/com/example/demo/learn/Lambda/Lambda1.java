package com.example.demo.learn.Lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda1 {
    public static void main(String args[]){

        List<String> s = new ArrayList<>(5);
        s.add("3");
        s.add("32");
        s.add("321");
        s.add("1");
        s.add("111");
        s.add("2");
        s.add("22");
        Collections.sort(s);
//        for(int i = 1; i <= s.length; i++){
//
//        }
        System.out.println(s);
        int a[] = {8, 9, 5, 9, 6, 6};
        String aa[] = {"1", "2", "3", "321", "21"};
        Arrays.stream(a).filter(x -> {
            if(x%2==0){
                return true;
            }
            return false;
        }).forEach(x->System.out.println(x));
        System.out.println();
//        Arrays.stream(aa).sorted(String::compareTo).forEach(System.out::println);
//        Arrays.stream(aa).sorted((x, y)->x.charAt(0) == x.charAt(0)?y.compareTo(x):x.compareTo(y)).forEach(System.out::println);
//        Arrays.stream(aa).sorted(String::compareTo)
//        Collectors.toMap()

        //
        Arrays.stream(a).mapToObj(x->x+"").sorted((x, y)-> (x+y).compareTo(y+x)).reduce((x, y)->x+y);
    }
}
