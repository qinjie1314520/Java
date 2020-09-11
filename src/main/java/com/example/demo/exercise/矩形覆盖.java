package com.example.demo.exercise;

public class 矩形覆盖 {

    class Solution {
        private int time = 0;
        public int RectCover(int target) {
            time++;
            if(time==1 && target==0){
                return 0;
            }
            if(target==0){
                return 1;
            }else if(target < 0){
                return 0;
            }
            return RectCover(target-1)+RectCover(target-2);
        }
    }
}
