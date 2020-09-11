package com.example.demo.exercise;

import java.util.Arrays;

public class 调整数字顺序使奇数位于偶数前面 {
    public static void main(String args[]){
        int array[] = {1, 2, 3, 4, 5, 6, 7};

        int[] newArray = new int[array.length];
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==1){
                newArray[j] = array[i];
                j++;
            }
        }
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                newArray[j] = array[i];
                j++;
            }
        }
        Arrays.stream(newArray).forEach(System.out::println);
    }
}
