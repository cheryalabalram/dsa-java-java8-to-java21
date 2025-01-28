package com.balram.demo.core.pack;

public class MainAB {
    public static void main(String[] args) {
        A a = new B();
        a.name(1);

        B b = new B();
        b.name();
        b.name(0);

        A.name("Balram");
        B.name("hi");
    }
}
