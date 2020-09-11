package com.example.demo.算法学习日志.时间20200809;

import java.util.Arrays;

public class 冒泡排序 {

    public static void main(String args[]) {
        int nums[] = {1,6,7,9,2,4,3,20,15,60,13};
        BubbleSort(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }

    public static void BubbleSort(int nums[]){
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
}
