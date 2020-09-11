package com.example.demo.learn.ArrayList;

import java.util.ArrayList;
import java.util.List;
public class ArrayList2 {
    public static void main(String args[]){

        /**
         * 1:数据保存在elementData这样一个Object[]中
         * 2:默认存在一个final的空对象数据，名字叫做DEFAULTCAPACITY_EMPTY_ELEMENTDATA。当不穿参数时候，我们就是用的这个不可变数组，
         * 其中elementData就是引用的DEFAULTCAPACITY_EMPTY_ELEMENTDATA，两个引用对象地址一样，只是名字不一样
         * 3:初始化后，其中的size由于是int，所以默认值是0，如果是Integer包装对象则默认值是null
         * 4:初始化后DEFAULTCAPACITY_EMPTY_ELEMENTDATA和elementData是一个东西
         */
        List<Integer> list = new ArrayList<Integer>();
        /**
         * 一进去就判断是不是为参数正不正常，正常就新建一个Object的数组给elementData
         */
        List<Integer> list1 = new ArrayList<Integer>(2);
//        t tt = new t();
//        System.out.println(tt.getS());
//        System.out.println(5 >> 1);
//        System.out.println(6 >> 1);
//        System.out.println(7 >> 1);
//        System.out.println(8 >> 1);
        /**
         * 1：加时，判断当前保存数据的数组对象是不是同DEFAULTCAPACITY_EMPTY_ELEMENTDATA这个引用的数组对象一样
         * 2：如果是同一个对象，在第一次添加数据有时候会直接把数组扩充到DEFAULT_CAPACITY（值：10）
         * 这个时候DEFAULTCAPACITY_EMPTY_ELEMENTDATA和elementData已经不是是一个东西了，
         * 3：之后需要扩充时，将会扩充原来的大小的1.5倍
         * 4：增加时涉及到移位运算，相右移n位，缩小，标识(原数据/2的n次方)。同理左移n位，扩大，标识（原数据*2的n此方）
         * 位移比直接除要快
         */
        list.add(1);
        list.add(2);
        list.add(3);
        list.set(2, 213);
        System.out.println(list.get(2));
        System.out.println(list.size());
    }
    public static class t{
        private int s;
        public int getS(){
            return s;
        }
    }
}
