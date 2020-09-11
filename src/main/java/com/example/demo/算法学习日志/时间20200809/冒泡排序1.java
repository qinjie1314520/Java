package com.example.demo.算法学习日志.时间20200809;

import java.util.Arrays;
// 时间复杂度 n*n
public class 冒泡排序1 {

    public static void main(String args[]) {
        int nums[] = {1,6,7,9,2,4,3,20,15,60,13};
        BubbleSort(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }

    public static void BubbleSort(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length- 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }
}
