package com.example.demo.exercise;

public class 跳台阶 {
    class Solution {
        private int re = 0;
        public int JumpFloor(int target) {
            if(target==0){
                return 1;
            }else if(target < 0){
                return 0;
            }
            int one = JumpFloor(target-1);
            int two = JumpFloor(target-2);
            return one+two;
        }
    }
}
