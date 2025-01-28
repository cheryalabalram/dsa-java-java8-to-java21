package com.balram.demo.core.sample;

import java.util.HashMap;
import java.util.Objects;

public class Sample {

    public static void sort(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int x) {
        x = 10;
        System.out.println(x);
    }

    public static void missingNumber(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            total = total - arr[i];
        }
        System.out.println(total);
    }

    public static boolean anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArray = s1.toCharArray();
        char[] charArray1 = s2.toCharArray();

        sort(charArray);
        sort(charArray1);
        return Objects.deepEquals(charArray, charArray1);
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        boolean anagram = anagram(s1, s2);
        System.out.println(anagram);

        int x = 5;
        print(x);
        System.out.println(x);

        System.out.println("Deep Equals - " + Objects.deepEquals(null, null));

        missingNumber(new int[]{1, 2, 3, 5, 6});

        appertainingOneTime(new int[]{1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6});

        consequetiveChars("aaabbccccddee");

        System.out.println("sortArrNbrs");
        sortArrNbrs(new int[]{2, 0, 2, 1, 1, 0});
    }

    private static void sortArrNbrs(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }

    private static void consequetiveChars(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        m.forEach((x, y) -> System.out.print(x + "" + y));

    }

    private static void appertainingOneTime(int[] arr) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            m.put(arr[i], m.getOrDefault(arr[i], 0) + 1);
        }

        m.forEach((key, value) -> {
            if (value == 1) {
                System.out.println(key);
            }
        });
    }
}
