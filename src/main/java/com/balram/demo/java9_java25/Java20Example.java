package com.balram.demo.java9_java25;

// Java 20: Example of record patterns (preview feature)
public class Java20Example {
    public static void main(String[] args) {
        record Point(int x, int y) {}
        Object obj = new Point(1, 2);
// Java 15: Example of sealed classes (preview feature)
        if (obj instanceof Point(int x, int y)) {
            System.out.println("x = " + x + ", y = " + y);
        }
    }
}

final class SubClass extends Java15Example {
}
