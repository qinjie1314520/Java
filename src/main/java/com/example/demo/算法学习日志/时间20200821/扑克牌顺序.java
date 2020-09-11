package com.example.demo.算法学习日志.时间20200821;

import java.util.Arrays;

public class 扑克牌顺序 {
    public static void main(String args[]){
        int a[] = {0,2,5,6,7};
        System.out.println(isContinuous(a));
    }
    public static boolean isContinuous(int[] numbers) {
        if(numbers.length==0){
            return false;
        }
        numbers = Arrays.stream(numbers).sorted().toArray();
        int a = 0;
        for(int i = 0; i < numbers.length-1; i++){
            if(numbers[i]==0){
                a++;
            }else{
                if(numbers[i] == numbers[i+1]){
                    return false;
                }else if(numbers[i]+1 <= numbers[i+1]){
                    a = a - (numbers[i+1]-numbers[i]-1);
                    if(a<0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
