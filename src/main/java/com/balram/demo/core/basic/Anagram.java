package com.balram.demo.core.basic;

public class Anagram {
    private static final String s1 = "silent";
    private static final String s2 = "listen";

    public static void main(String[] args) {
        if (s1.length() != s2.length()) {
            System.out.println("Not an anagram");
            return;
        }

        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println("Not an anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
