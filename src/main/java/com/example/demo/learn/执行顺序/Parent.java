package com.example.demo.learn.执行顺序;
//1. 先执行父类的静态代码块和静态变量初始化，并且静态代码块和静态变量的执行顺序只跟代码中出现的顺序有关。
//2. 执行子类的静态代码块和静态变量初始化。
//3. 执行父类的实例变量初始化
//4. 执行父类的构造函数
//5. 执行子类的实例变量初始化
//6. 执行子类的构造函数
public class Parent {
    public Parent() {
        System.out.println("parent  construct");
    }
    static {
        System.out.println("parent  static");
    }
}
