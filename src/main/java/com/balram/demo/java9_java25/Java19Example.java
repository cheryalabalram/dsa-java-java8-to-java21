package com.balram.demo.java9_java25;

// Java 19: Example of virtual threads (preview feature)
import java.util.concurrent.Executors;

public class Java19Example {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.println("Hello from virtual thread!"));
        }
    }
}
