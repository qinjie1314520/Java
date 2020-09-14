package com.example.demo.learn.SimpleDateFormat;

import lombok.SneakyThrows;

import java.text.ParseException;
import java.text.SimpleDateFormat;

// parse（）调用情况：
//
//            1）先调用DateFormat对象的public Date parse(String source) throws ParseException
//
//            2）DateFormat对象的parse方法调用SimpleDateFormat对象的public Date parse(String text, ParsePosition pos)
//
//            3）SimpleDateFormat对象的parse方法调用 CalendarBuilder 对象的 Calendar establish(Calendar cal)
//
//            4）在 establish（）中，做了cal.clear();把calendar清空且没有设置新值。如果此时线程A将calendar清空且没有设置新值，线程B也进入parse方法用到了SimpleDateFormat对象中的calendar对象，此时就会产生线程安全问题！
public class SimpleDateFormat的线程不安全 {
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String args[]) {
        String dateStr = "2018-11-03 10:02:47";
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(simpleDateFormat.parse(dateStr));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
//解决办法
//1.使用ThreadLocal为每个线程都创建一个线程独享的SimpleDateFormat变量
//2.创建一个共享的SimpleDateFormat实例变量，但在使用的时候，需要对这个变量进行同步
//3.需要的时候创建局部变量
