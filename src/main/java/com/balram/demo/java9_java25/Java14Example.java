package com.balram.demo.java9_java25;

// Java 14: Example of instanceof with pattern matching (preview feature)
public class Java14Example {
    public static void main(String[] args) {
        Object obj = "Hello, Java 14!";
        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }
    }
}
