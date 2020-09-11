package com.example.demo.算法;

public class 二分查找 {
    public static void main(String args[]){
        int a[] = {1, 2,3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(a[get(a, 101)]);
    }
    public static int get(int a[], int num){
        int high = a.length - 1;
        int low = 0;
        int index = -1;
        while(high >= low){
            int tmp = (high + low) / 2;
            if(a[tmp] < num){
                low = tmp+1;
            }else if(a[tmp] > num){
                high = tmp - 1;
            }else{
                index = tmp;
                break;
            }
        }
        return index;
    }
}
