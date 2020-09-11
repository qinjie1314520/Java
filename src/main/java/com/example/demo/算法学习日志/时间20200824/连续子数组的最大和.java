package com.example.demo.算法学习日志.时间20200824;

public class 连续子数组的最大和 {
    public static void main(String args[]){
        int a[] = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(a,0,0));
    }
    public static int FindGreatestSumOfSubArray(int[] array, int i, int sum) {
        if(i >= array.length){
            return sum;
        }
        //选
        int sum1 = FindGreatestSumOfSubArray(array, i + 1,sum+array[i]);
        //不选
        int sum2 = FindGreatestSumOfSubArray(array, i + 1,0);
        return sum1> sum2?sum1:sum2 ;
    }
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
