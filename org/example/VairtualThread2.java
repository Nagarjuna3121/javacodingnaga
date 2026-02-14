package org.example;

public class VairtualThread2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () ->{
            System.out.println("hello im virtaul: " +Thread.currentThread().getName());
        };

        Thread virtualThread = Thread.startVirtualThread(task);
        virtualThread.join();
        System.out.println("main thread finished");
        System.out.println("hello");
    }
}
