package com.example.demo.算法;

public class 快速排序 {
    public static void main(String args[]){
        int a[] = {1, 9, 6, 7, 1, 3, 5, 87, 6, 8, 33, 646};
        int times = 0;
    }

    public static void sort(int a[], int start, int end){
        int startTmp = start;
        //从高到低扫描
        for(int i = end; i > start; i--){
            if(a[i] < a[startTmp]){
                int tmp = a[startTmp];
                a[startTmp] = a[i];
                a[end] = tmp;
                end = i-1;
                startTmp = i;
                break;
            }
        }
        //从低到高扫描
        for(int i = start+1; i <= end; i++){
            if(a[i] > a[startTmp]){
                int tmp = a[startTmp];
                a[startTmp] = a[i];
                a[i] = tmp;
                start = i+1;
                startTmp = i;
                break;
            }
        }
        while(start != end){
            if(a[end] < a[startTmp]){
                int tmp = a[startTmp];
                a[startTmp] = a[end];
                a[end] = tmp;
            }
        }
    }
}
