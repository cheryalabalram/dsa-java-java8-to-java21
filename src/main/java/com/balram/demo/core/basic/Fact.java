package com.balram.demo.core.basic;

public class Fact {
    public static void main(String[] args) {

        int n = 5;
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
