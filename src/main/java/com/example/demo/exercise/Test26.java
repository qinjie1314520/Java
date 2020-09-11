package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test26 {
    private static List<Integer> res = new ArrayList<>();

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextLine()){
            //测试总数
            int n = in.nextInt();
            List<XY> A = new ArrayList<>(n);
            List<XY> B = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                A.add(new XY(in.nextInt(), in.nextInt()));
            }
            for (int i = 0; i < n; i++) {
                B.add(new XY(in.nextInt(), in.nextInt()));
            }
            XY max = A.get(0);
            XY max1 = B.get(0);
            double maxNum = 0.0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(((max.getX()-max1.getX())^2 + (max.getY()-max1.getY())^2) > maxNum){
                        max = A.get(i);
                        max1 = B.get(j);
                    }
                }
            }
            System.out.println(Math.sqrt((max.getX()-max1.getX())^2 + (max.getY()-max1.getY())^2));
        }
    }

    public static class XY {
        Integer x;
        Integer y;

        public XY(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }

        public Integer getX() {
            return x;
        }

        public void setX(Integer x) {
            this.x = x;
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }
    }
}
