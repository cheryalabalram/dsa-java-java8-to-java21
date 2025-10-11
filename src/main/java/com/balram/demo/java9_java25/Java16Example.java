package com.balram.demo.java9_java25;

// Java 16: Example of records
public record Java16Example(String name, int age) {
    public static void main(String[] args) {
        Java16Example example = new Java16Example("Alice", 30);
        System.out.println(example.name());
        System.out.println(example.age());
    }
}
