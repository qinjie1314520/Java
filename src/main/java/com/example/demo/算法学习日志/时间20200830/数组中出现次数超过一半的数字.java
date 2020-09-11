package com.example.demo.算法学习日志.时间20200830;

import java.util.HashMap;
import java.util.Iterator;

public class 数组中出现次数超过一半的数字 {
    public static void main(String args[]){
        HashMap<Integer,Integer> re = new HashMap();
        int [] array = {1,2,3,2,2,2,5,4,2};

        for(int a : array){
            Integer aa = re.get(a);
            if(aa==null){
                re.put(a, 1);
            }else{
                re.put(a, aa + 1);
            }
        }
        Iterator<Integer> it = re.keySet().iterator();
        int n = array.length/2;
        while(it.hasNext()){
            int key ;
            key = it.next();
            if(re.get(key) > n){
                re.get(key);
            }
        }

    }
}
