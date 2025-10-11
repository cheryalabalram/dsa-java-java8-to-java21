package com.balram.demo.java9_java25;

// Java 9: Example of a private method in an interface
public interface Java9Example {
    default void publicMethod() {
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private method in interface (Java 9)");
    }
}
