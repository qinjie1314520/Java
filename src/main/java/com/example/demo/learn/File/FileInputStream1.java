package com.example.demo.learn.File;

import java.io.*;

public class FileInputStream1 {
    public static void main(String args[]){
        try {
            /**
              * 内容：GBK保存的txt，在我的电脑，2个字节一个中文，其他字符一个字节
              *  我需要用byte[2]接受即可，
              * UTF-8保存的内容，2个字节一个中文，其他字符一个字节，我需要用byte[3]接受
              *
             **/
            FileInputStream fileInputStream = new FileInputStream(new File("G://1.txt"));
            FileInputStream fileInputStream1 = new FileInputStream(new File("G://2.txt"));
            byte b[] = new byte[2];
            byte b1[] = new byte[2];
            fileInputStream.read(b);
            System.out.println(new String(b));
            fileInputStream1.read(b1);
            System.out.println(new String(b1, "GBK"));
//            fileInputStream.read(b);
//            System.out.println(new String(b,"GBK"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
