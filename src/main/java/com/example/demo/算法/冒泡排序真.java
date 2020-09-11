package com.example.demo.算法;
/**
 * 百度百科——冒泡排序
 * 一行数据，从小到大
 * 当i=0，从第一个开始，比较第一和第二，如果满足条件，替换，然后比较第二个和第三个
 * 相当于两两比较，知道最好，最大的数就被换到最后
 * 然后i=1,在从第一个开始比较，依此比较到最后一个的前一个，因为最后一个已经最大了
 * 最后就排序完成
 * 时间复杂度度平均O(n^2)
 */
public class 冒泡排序真 {
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6,8};
        int times = 0;
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length-1-i; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
                times++;
            }
        }
        System.out.println("大小："+a.length+",时间复杂度："+times);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
