package com.example.demo.learn.LinkedHashmap;

import org.apache.poi.hdgf.streams.Stream;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap1 {
    public static void main(String args[]){
        LinkedHashMap linkedHashMap = new LinkedHashMap();
//        linkedHashMap.put("a", "1");
//        linkedHashMap.put("b", "2");
//        linkedHashMap.put("c", "3");
//        linkedHashMap.forEach((x, y)->System.out.println(x+"->"+y));

        String s = "google";
        s.chars().forEach(x->{
            Object obj = linkedHashMap.get(x);
            if(obj==null){
                linkedHashMap.put(x, 1);
            }else{
                linkedHashMap.put(x, Integer.valueOf(obj+"")+1);
            }
        });
        Iterator iterator = linkedHashMap.keySet().iterator();
       while(iterator.hasNext()){
           Object key = iterator.next();
           if(linkedHashMap.get(key).equals(1)){
               System.out.println(s.indexOf((char)Integer.valueOf(key+"").intValue()+""));
           }
       }

    }
}
