package com.example.demo.算法学习日志.时间20200818;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 二叉树的后序遍历序列 {

//import java.util.Arrays;
//public class Solution {
//    public int count = 0;
// public boolean VerifySquenceOfBST(int [] sequence) {
//     if(count==0 && sequence.length==0){
//         return false;
//     }
//     if(sequence==null || sequence.length<=1){
//            return true;
//        }
//     count++;
//        int x = sequence[sequence.length-1];
//
//        int t[] = Arrays.copyOfRange(sequence, 0, sequence.length-1);
//        int i = split(t,x);
//        if(i==-1){
//            return false;
//        }else{
//            return VerifySquenceOfBST(Arrays.copyOfRange(t, 0, i)) && VerifySquenceOfBST(Arrays.copyOfRange(t, i, t.length));
//        }
//    }
//
//    public int split(int datas[], int target){
//        int ii = 0;
//        for(int i = 0; i < datas.length; i++){
//            if(target <= datas[i]){
//                for(int j = i+1; j < datas.length; j++){
//                    if(target > datas[j]){
//                        return -1;
//                    }
//                }
//                return i;
//            }
//        }
//        return datas.length-1;
//    }
//}
}
