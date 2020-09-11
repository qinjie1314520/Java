package com.example.demo.learn;

public class 自动拆箱装箱 {
    public static void main(String[] args) {
        Integer integer = 128;
        Integer integer1 = 128;
        Integer integer2 = -128;
        Integer integer3 = -128;
        //自动拆箱装箱的范围[-128,127]
        System.out.println(integer==integer1);
        System.out.println(integer2==integer3);
        //测试
        int a = 10;
        System.out.println("秦杰是帅哥哦");


    }
}
