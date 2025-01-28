package com.balram.demo.core.threads;

import java.util.concurrent.CompletableFuture;

public class ThreadsDemo {
    public static String print(String s){
        return Thread.currentThread().getName() + " : "
                + Thread.currentThread().getThreadGroup()
                + " : "+s;
    }

    public static void main(String[] args) {
        // Using runAsync()
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println(print("runAsync()"));
        });

        // Using supplyAsync()
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            return print("Result from supplyAsync()");
        });

        // future1.join() ensures that the first CompletableFuture (future1) completes before proceeding to the next line.
        // After future1 completes, future2.join() is called, which blocks until future2 completes. Therefore,
        // future1 completes first, followed by future2
        future1.join();
        String result = future2.join(); // Blocks until the future completes
        System.out.println(result);

    }
}
