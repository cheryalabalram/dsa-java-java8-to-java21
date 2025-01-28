package com.balram.demo.actions.SG.main;

import java.util.Objects;

public class S_SingletonClazz {
    private static S_SingletonClazz sSingletonClazz;

    // Private constructor to prevent instantiation
    private S_SingletonClazz() {
    }

    // Static method to provide a global point of access
    public static S_SingletonClazz getsSingletonClazz() {
        if (sSingletonClazz == null) {
            sSingletonClazz = new S_SingletonClazz();
        }
        return sSingletonClazz;
    }

    public static void main(String[] args) {
        S_SingletonClazz sSingletonClazz1 = S_SingletonClazz.getsSingletonClazz();
        S_SingletonClazz sSingletonClazz2 = S_SingletonClazz.getsSingletonClazz();
        boolean equals = Objects.equals(sSingletonClazz1, sSingletonClazz2);
        System.out.println(equals); // This should now print "true"
    }
}
