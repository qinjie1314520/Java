package com.example.demo.learn.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 反射获取对象的区别 {
    public static void main(String args[]) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
//        User user = new User();
//        User user1 = new User();

        //反射代码块是每个对象实例化时执行，和属性按照顺序执行


        //反射获取对象
//        Class cl = User.class;
//        Constructor constructor = cl.getDeclaredConstructor();
//        System.out.println("User.class");
//        User user = (User) constructor.newInstance();

//        System.out.println("Class.forName");
//        Class c2 = Class.forName("com.example.demo.learn.反射.User");
//        c2.getConstructor().newInstance();



        //输出：无
        //解释：加载进入内存，但是没有初始化
//        Class cl = User.class;
        //输出：静态代码块
        //解释：加载进入内存，初始化后返回
//        Class c2 = Class.forName("com.example.demo.learn.反射.User");

        Class c1 = User.class;
        System.out.println("————————————————————————————");
        Class c2 = Class.forName("com.example.demo.learn.反射.User");
        Class c3 = new User().getClass();
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);



    }

}
