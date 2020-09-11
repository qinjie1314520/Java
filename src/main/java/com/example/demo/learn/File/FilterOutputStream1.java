package com.example.demo.learn.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FilterOutputStream1 {
    public static void main(String args[]){
        try {
            FilterOutputStream filterOutputStream = new FilterOutputStream(new FileOutputStream(new File("G://4.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
