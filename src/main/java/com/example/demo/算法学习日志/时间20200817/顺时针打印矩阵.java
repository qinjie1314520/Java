package com.example.demo.算法学习日志.时间20200817;

public class 顺时针打印矩阵 {
    public static void main(String args[]){
        int a[][] = new int[5][];
        a[0] = new int[5];
        System.out.println("ad");
    }
}
//import java.util.ArrayList;
//public class Solution {
//    public ArrayList<Integer> printMatrix(int [][] matrix) {
//       ArrayList<Integer> res = new ArrayList<>();
//       int aa[][] = new int[matrix.length][];
//       for(int i = 0; i < aa.length; i++){
//           aa[i] = new int[matrix[i].length];
//       }
//       int i =0,j = 0,stat = 0;
//        while((i >=0 && i < aa.length) && (j >=0 && j < aa[i].length) && aa[i][j]==0){
//            res.add(matrix[i][j]);
//            aa[i][j]=1;
//            switch(stat){
//                case 0:
//                    //右
//                    if(j<aa[i].length-1 && aa[i][j+1]==0){
//                        j++;
//                    }else{
//                        stat = 1;
//                        i++;
//                    }
//                    break;
//                case 1:
//                    //下
//                    if(i < aa.length-1 && aa[i+1][j]==0){
//                        i++;
//                    }else{
//                        stat = 2;
//                        j--;
//                    }
//                    break;
//                case 2:
//                    //左
//                      if(j > 0 && aa[i][j-1]==0){
//                       j--;
//                    }else{
//                        stat = 3;
//                        i--;
//                    }
//
//                    break;
//                case 3:
//                    //上
//                     if(i > 0 && aa[i-1][j]==0){
//                       i--;
//                    }else{
//                        stat = 0;
//                         j++;
//                    }
//                    break;
//                default:
//            }
//
//        }
//        return res;
//    }
//}
