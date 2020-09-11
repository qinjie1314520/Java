package com.example.demo.算法学习日志.时间20200809;

import java.util.Arrays;

public class 快排 {
    public static void main(String args[]) {
        int nums[] = {1, 6, 2, 3, 4, 80, 12, 36, 56};
        test(nums,0,nums.length-1);


        Arrays.stream(nums).forEach(System.out::println);
    }
    public static void FastRow1(int nums[],int left,int right){
        int start = left;
        int end = right;
        if(nums==null || nums.length == 0){
            return;
        }
        if(start >= end){
            return;
        }
        int tmp = nums[start];
        while(start < end){
            while(start < end && nums[end] >= tmp){
                end--;
            }
            nums[start] = nums[end];
            while(start < end && nums[start] <= tmp){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = tmp;
        FastRow1(nums,left,end-1);
        FastRow1(nums,start+1,right);
    }





    public static void test(int nums[],int start,int end){
        int left = start;
        int right = end;

        if(nums==null || nums.length==0 || start >= end){
            return;
        }

        int tmp = nums[left];
        while(left < right){
            while(left < right && nums[right] >= tmp){
                right--;
            }
            nums[left] = nums[right];
            while(left < right && nums[left] <= tmp){
                left++;
            }
            nums[right] = nums[left];
        }

        nums[right] = tmp;
        test(nums,start,right-1);
        test(nums,right+1,end);

    }
}
