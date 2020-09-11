package com.example.demo.learn.引用类型;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

//软引用是用来描述一些非必需但仍有用的对象。在内存足够的时候，软引用对象不会被回收，只有在内存不足时，系统则会回收软引用对象，如果回收了软引用对象之后仍然没有足够的内存，才会抛出内存溢出异常。这种特性常常被用来实现缓存技术，比如网页缓存，图片缓存等。
//在 JDK1.2 之后，用java.lang.ref.SoftReference类来表示软引用。
public class 软引用 {
    private static List<Object> list = new ArrayList<>();
    public static void main(String[] args) {
        testSoftReference();
    }
    private static void testSoftReference() {
        for (int i = 0; i < 10; i++) {
            byte[] buff = new byte[1024 * 1024];
            SoftReference<byte[]> sr = new SoftReference<>(buff);
            list.add(sr);
        }

        System.gc(); //主动通知垃圾回收

        for(int i=0; i < list.size(); i++){
            Object obj = ((SoftReference) list.get(i)).get();
            System.out.println(obj);
        }

    }
}
