package com.example.demo.learn.引用类型;

import java.lang.ref.PhantomReference;

//虚引用是最弱的一种引用关系，如果一个对象仅持有虚引用，那么它就和没有任何引用一样，
// 它随时可能会被回收，在 JDK1.2 之后，用 PhantomReference 类来表示
// 通过查看这个类的源码，发现它只有一个构造函数和一个 get() 方法，
// 而且它的 get() 方法仅仅是返回一个null，也就是说将永远无法通过虚引用来获取对象，
// 虚引用必须要和 ReferenceQueue 引用队列一起使用。

//引用队列可以与软引用、弱引用以及虚引用一起配合使用，当
// 垃圾回收器准备回收一个对象时，如果发现它还有引用，那么就会在回收对象之前，
// 把这个引用加入到与之关联的引用队列中去。程序可以通过判断引用队列中是否已经加入了引用，
// 来判断被引用的对象是否将要被垃圾回收，这样就可以在对象被回收之前采取一些必要的措施。
//
//与软引用、弱引用不同，虚引用必须和引用队列一起使用。
public class 虚引用 {
    public static void main(String args[]){
//        PhantomReference phantomReference = new PhantomReference<String>();
    }
}
