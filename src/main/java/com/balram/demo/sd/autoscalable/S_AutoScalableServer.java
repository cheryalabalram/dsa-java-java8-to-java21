package com.balram.demo.sd.autoscalable;

import java.util.concurrent.atomic.AtomicInteger;

public class S_AutoScalableServer {

    private static final int REQUEST_THRESHOLD = 3;
    private static final AtomicInteger requestCount = new AtomicInteger(0);

    public static void main(String[] args) {

        // Simulate incoming requests
        for (int i = 0; i < 10; i++) {
            System.out.println("Requests in the last minute: " + requestCount.get());
            if (requestCount.incrementAndGet() > REQUEST_THRESHOLD) {
                scaleUpServer();
            } else {
                handleRequest();
            }
            try {
                Thread.sleep(2000); // Simulate time between requests
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void handleRequest() {
        requestCount.incrementAndGet();
        System.out.println("Handling request. Current count: " + requestCount.get());
    }

    public static void scaleUpServer() {
        System.out.println("Scaling up the server...");
        // Add logic to scale up the server (e.g., start a new server instance)
        System.out.println("Server scaled up successfully.");
    }
}