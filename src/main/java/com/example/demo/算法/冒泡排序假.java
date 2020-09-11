package com.example.demo.算法;

/**
 * 自己想的垃圾算法
 * 一行数据，从小到大
 * 第一次替换，循环n-i次，把第一个值替换成了最小的
 * 第二次替换，替换第二个值为（除第一个外）最小，
 * 然后，就排序完成，哈哈
 * 执行次数： n^2/2 - n/2   时间复杂度O(n^2)(平均，最好，最差)
 */
public class 冒泡排序假 {
    public static void main(String args[]) {
//        int a[] = {8, 9, 1, 3, 4, 7, 6, 6};
        int a[] = {1,3,5,6,8,9};
        int times = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
                times++;
            }
        }
        System.out.println("大小："+a.length+",时间复杂度："+times);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
