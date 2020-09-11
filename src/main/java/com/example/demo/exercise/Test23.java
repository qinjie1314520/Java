package com.example.demo.exercise;


import java.util.Scanner;


public class Test23 {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            System.out.println(fileExtension(str));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //返回文件后缀
    //返回文件后缀
    public static String fileExtension(String file){
        String res = null;
        if(file.endsWith(".tar.gz")){
            res = "tar.gz";
        }else if(file.lastIndexOf(".") != -1){
            res = (file.substring(file.lastIndexOf(".")+1));
        }
        return res;
    }
}
