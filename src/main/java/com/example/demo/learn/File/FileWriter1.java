package com.example.demo.learn.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {
    public static void main(String args[]){
        try {
            File file = new File("G://3.txt");
            System.out.print(file.getTotalSpace());
            FileWriter writer = new FileWriter(file);
            char a[] = new char[5];
            a[0] = '哎';
            a[1] = '哎';
            a[2] = '哎';
            a[3] = '哎';
            a[4] = '哎';
            writer.write(a);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
