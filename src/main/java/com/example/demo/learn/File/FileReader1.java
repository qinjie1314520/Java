package com.example.demo.learn.File;

import java.io.*;

public class FileReader1 {
    public static void main(String args[]){
        try {
            char a[] = new char[2];
            FileReader fileReader = new FileReader(new File("G://1.txt"));
            fileReader.read(a);
            System.out.println(a[0]+""+a[1]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
