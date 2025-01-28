package com.balram.demo.sd.roundrobbin;

import java.util.concurrent.atomic.AtomicInteger;

public class S_RoundRobinAlg {
    // Write round-robin algorithm to send request to 2 servers
    private static final String[] servers = {"server1", "server2"};
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static String getServer() {
        int index = counter.getAndIncrement() % servers.length;
        return servers[index];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Request sent to server: " + getServer());
        }
    }
}
