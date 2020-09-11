package com.example.demo.learn.Thread;

//wait释放锁，进入该类等待池，sleep不释放

//锁池:假设线程A已经拥有了某个对象(注意:不是类)的锁，
// 而其它的线程想要调用这个对象的某个synchronized方法(或者synchronized块)，
// 由于这些线程在进入对象的synchronized方法之前必须先获得该对象的锁的拥有权，
// 但是该对象的锁目前正被线程A拥有，所以这些线程就进入了该对象的锁池中。

// 等待池:假设一个线程A调用了某个对象的wait()方法，
// 线程A就会释放该对象的锁(因为wait()方法必须出现在synchronized中，
// 这样自然在执行wait()方法之前线程A就已经拥有了该对象的锁)，同时线程A就进入到了该对象的等待池中。
// 如果另外的一个线程调用了相同对象的notifyAll()方法，
// 那么处于该对象的等待池中的线程就会全部进入该对象的锁池中，准备争夺锁的拥有权。
// 如果另外的一个线程调用了相同对象的notify()方法，
// 那么仅仅有一个处于该对象的等待池中的线程(随机)会进入该对象的锁池.
public class 线程测试22 {
    public static void main(String args[]) {
        Object s = new Object();
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"等待唤醒");
                try {
                   synchronized (s){
                       s.wait();
                   }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"醒了");
            }
        };
        Thread thread2 = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"等待唤醒");
                try {
                    synchronized (s){
                        s.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"醒了");
            }
        };
        Thread thread3 = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    synchronized (s){
//                        s.notify();
                        s.notifyAll();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("通知一个醒");
            }
        };
        thread1.start();
        thread2.start();
        System.out.println("主线程执行完毕");
        thread3.start();

    }

}
