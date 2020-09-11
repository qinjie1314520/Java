package com.example.demo.learn.锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock1 {
    private final static Lock lock = new ReentrantLock();

    public static void main(String args[]) {
        lock.lock();
        lock.unlock();

        synchronized (new ReentrantLock1()) {
            System.out.println("hello");
        }
    }
}
