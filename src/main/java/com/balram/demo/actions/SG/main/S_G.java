package com.balram.demo.actions.SG.main;

import java.util.concurrent.atomic.AtomicBoolean;

public class S_G {

    public final AtomicBoolean evenFlag = new AtomicBoolean(false);
    public final int max = 10;

    public void printOdd() {
        for (int i = 1; i <= max; i += 2) {
            synchronized (this) {
                while (evenFlag.get()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
                evenFlag.set(true);
                notify();
            }
        }
    }

    public void printEven() {
        for (int i = 2; i <= max; i += 2) {
            synchronized (this) {
                while (!evenFlag.get()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                System.out.println(Thread.currentThread().getName() + ": " + i);
                evenFlag.set(false);
                notify();
            }
        }
    }

    public static void main(String[] args) {
        S_G s = new S_G();
//        Thread.ofVirtual().name("even").start(s::printEven);
//        Thread.ofVirtual().name("odd").start(s::printOdd);

        Thread t1 = new Thread(s::printOdd, "Odd-Thread");
        Thread t2 = new Thread(s::printEven, "Even-Thread");

        t1.start();
        t2.start();
    }
}
