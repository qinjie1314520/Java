package com.example.demo.learn.LinkedHashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class 初始化 {
    public static void main(String args[]){
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(new HashMap());
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(10);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(10,0.75f);
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(10,0.75f,true);
        linkedHashMap1.put("a", "1");
//        linkedHashMap.put("b", "2");
//        linkedHashMap.put("c", "3");
//        linkedHashMap.forEach((x, y)->System.out.println(x+"->"+y));


    }
}
