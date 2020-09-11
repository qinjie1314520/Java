package com.example.demo.learn.HashMap;

import java.util.HashMap;

public class 初始化 {
    public static void main(String args[]){
        /**
         * 1，new HashMap()初始化设置loadFactor=DEFAULT_LOAD_FACTOR，值是0.75f
         * 2，HashMap中hashcode方法为了减少equals的此时equals
         * 3,HashMap中Node<K,V>[] table保存节点信息
         * 4，初始化就是设置了加载因子和临界值的值
         */
        HashMap hashMap1 = new HashMap(13);
        hashMap1.put("a", "a");
//        System.out.println(s);
//        System.out.println(hashMap.put("a",
//        "a222"));

//        System.out.println(tt.a.length);
//        System.out.println(tt.tt.length);

        //1000 1100
        System.out.println(8 & 12);
        System.out.println(0.75f * 16);
    }
    private static class t{
        public t[] tt;
        public int[] a;
    }
}
