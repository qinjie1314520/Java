package com.example.demo.算法学习日志.时间20200821;

import java.util.Arrays;

public class 把数组排成最小的数 {
    public static void main(String args[]){
        int numbers[] = {3, 32, 321};
        String s[] = new String[numbers.length];
        for(int i = 0; i < numbers.length ; i++){
            s[i] = String.valueOf(numbers[i]);
        }
        System.out.println((Arrays.stream(s).sorted((x, y)-> (x+y).compareTo(y+x)).reduce((x, y)->x+y)).get());
    }
}
