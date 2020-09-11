package com.example.demo.learn.HashMap;

import java.util.HashMap;

public class remove {
    public static void main(String args[]){
        /**
         * 删除返回null或者删除节点的值
         */
        HashMap hashMap = new HashMap();
        String a = ""+hashMap.put("a", "a");
        hashMap.remove("a");
        //删除当key相同并且value相同
        hashMap.remove("a", "a");
    }
    private static class t{
        public t[] tt;
        public int[] a;
    }
}
