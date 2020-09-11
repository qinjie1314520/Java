package com.example.demo.算法;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
//6 5
//787585
public class 选靓号 {
    public static void main(String argsp[]){
        Scanner in = new Scanner(System.in);

        String ss[] = in.nextLine().split(" ");
        int k = Integer.parseInt(ss[1]);
        int n = Integer.parseInt(ss[0]);
        String num = in.nextLine();

        //保存每一个靓号指标得到花费
        HashMap<Integer, Integer> res = new HashMap<>();

        //保存每一个值对应的字符串
        HashMap<Integer, Integer> res1 = new HashMap<>();



        //依此把每一个位置上的数作为一个靓号的指标
        for(int i = 0; i < n; i++){
            //第i个字符转化为数字
            Integer ii = Integer.valueOf(num.charAt(i) + "");
            //数据重复的就不要再去计算了
            if(res.get(ii)==null){
                //保存当前指标下对num中每一位改变产生费用
                int arr[] = new int[n];


                //开始循环计算第i个靓号指标得到花费
                for(int j = 0;j<n; j++){
                    //转为数字
                    Integer jj = Integer.valueOf(num.charAt(j) + "");
                    arr[j] = Math.abs(jj - ii);
                }


                //排序，从小到大
                Arrays.sort(arr);
                //保存当前指标下花费的费用
                int sum = 0;
                for(int j = 0; j < k; j++){
                    sum += arr[j];
                }
                res.put(ii, sum);
            }
        }

        Collection<Integer> va = res.values();
        Object[] aa = va.toArray();
        Arrays.sort(aa);
        int min = (int) aa[0];

        for(Object a : aa){
            if(min > (int)a ){
                min = (int) a;
            }
        }
        System.out.println(min);
    }
}
