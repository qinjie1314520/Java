package com.example.demo.learn.继承;
//如果父类只有有参构造方法，那么子类必须要重写父类的构造方法

/**
 * java中可以存在默认的构造方法，但是前提是类里面不存在显式定义了构造方法
 */
public class Child extends Parent {

    public Child(int a) {
        super(a);
    }
}
