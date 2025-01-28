package com.balram.demo.actions.SG.main;

//When two or more threads are waiting on each other to release resources, and as a result,
// none of the threads can proceed. Detecting deadlocks can be challenging but is crucial in multi-threaded applications.
public class S_LockExample {
    private final String lock1 = "";
    private final String lock2 = "";

    public void method1()  {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock 1...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }

    public void method2() {
//        synchronized (lock2) {
        synchronized (lock1) {
            System.out.println("Thread 2: Holding lock 2...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2 & 1...");
            }
        }
    }

    public static void main(String[] args) {
        S_LockExample example = new S_LockExample();
        new Thread(example::method1).start();
        new Thread(example::method2).start();
    }

}
