package com.example.demo.exercise;

public class 变态跳台阶 {
    class Solution {
        private int re = 0;
        public int JumpFloorII(int target) {
            if(target==0){
                return 1;
            }else if(target < 0){
                return 0;
            }
            int res = 0;
            for(int i = 1; i <= target; i++){
                res += JumpFloorII(target-i);
                if(target-i<0){
                    break;
                }
            }
            return res;
        }
    }
}
