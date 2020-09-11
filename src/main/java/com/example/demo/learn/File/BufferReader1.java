package com.example.demo.learn.File;

import java.io.*;

public class BufferReader1 {
    public static void main(String args[]){
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader(new File("G://1.txt")));
            System.out.println(bufferReader.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
