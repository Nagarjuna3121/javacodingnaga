package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceReentrantLock {
    private final ReentrantLock lock = new ReentrantLock();

    public void performTask(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " performing task");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SharedResourceReentrantLock sharedResourceReentrantLock = new SharedResourceReentrantLock();
        sharedResourceReentrantLock.performTask();
    }
}
