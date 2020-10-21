package com.example.demo.learn.泛型;

import java.util.HashMap;
import java.util.Map;

public class 泛型擦除反编译 {
        public static void main(String[] args) {
            Map<String,String> map = new HashMap<>();
            map.put("King","18");
            System.out.println(map.get("King"));
        }
}
