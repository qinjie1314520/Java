package com.example.demo.算法学习日志.时间20200809;

public class 折半查找 {
    public static void main(String args[]){
        int nums[] = {1, 2, 4, 6, 7, 8, 9, 10, 15, 16, 18, 20};
        int i = BinarySearch(nums, 20);
        if(i == -1){
            System.out.println("没有结果");
        }else{
            System.out.println("查找结果：" + nums[i]);
        }

    }

    /**
     * 功能描述: 折半查找，查找成功返回目标所在数组的索引，否则返回-1。时间复杂度logn ,每个平均查找次数log2n
     * @param nums 排序好的对象
     * @param target 目标值
     * @return int
     */
    private static int BinarySearch(int nums[],int target){
        int x = 0;
        int y = nums.length;

        while(x <= y){
            int middle = (x + y) / 2;
            if(nums[middle] > target ){
                y = middle - 1;
            }else if(nums[middle] < target){
                x = middle + 1;
            } else{
                return middle;
            }
        }
        return -1;
    }




}
