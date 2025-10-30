package org.example;

public class PrintTwoThreadsOddEvenNumbers {

    private static Object lock = new Object();

    public static void main(String args[]){

        Runnable runnable1 = () -> {
            for(int i=1; i<=10; i=i+2){
                synchronized (lock) {
                    System.out.println("Thread 1: "+i);
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Runnable runnable2 = () -> {
            for(int i=2; i<=10; i=i+2){
                synchronized (lock) {
                    System.out.println("Thread 2: "+i);
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        System.out.println("Thread Start: ");
        thread1.start();
        thread2.start();
    }

}