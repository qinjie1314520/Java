package com.example.demo.learn.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class remove {
    public static void main(String args[]){
        //list.remove(index);移除指定索引的数据，并且把后面的向前移动1步
        //list.remove(Object);循环，移除第一次出现的这个对象，包括null
        //注意就移除一个，并且移动数据
        List<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        //可以的
//        list.add(null);

        list.remove(0);
        //这里还是会移除1的
        list.remove((Integer)1);
        //按照指定条件进行删除,删除偶数
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0?true:false;
            }
        });
        list.removeAll(list);
        System.out.println(list.size());
        System.out.println(list);
    }
}
