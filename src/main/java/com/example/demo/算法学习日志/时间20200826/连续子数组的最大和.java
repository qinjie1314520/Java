package com.example.demo.算法学习日志.时间20200826;

public class 连续子数组的最大和 {

}

//public class Solution {
//    public int FindGreatestSumOfSubArray(int[] array) {
//        if(array==null || array.length==0){
//            return 0;
//        }
//        int su[] = new int[array.length];
//        su[0] = array[0];
//        int re = su[0];
//        for(int i = 1; i < array.length; i++){
//            su[i] = Math.max(su[i-1]+array[i],array[i]);
//            if(re < su[i]){
//                re = su[i];
//            }
//        }
//        return re;
//
//    }
//
//
//}
