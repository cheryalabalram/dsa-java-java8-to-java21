package com.balram.demo.java9_java25;

// Java 12: Example of switch expressions (preview feature)
public class Java12Example {
    public static void main(String[] args) {
        int day = 5;
        String result = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid day";
        };
        System.out.println(result);
    }
}
