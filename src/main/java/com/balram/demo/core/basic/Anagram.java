package com.balram.demo.core.basic;

public class Anagram {
    private static final String s1 = "silent";
    private static final String s2 = "listen";

    public static void sortWay(int[] a){

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (int i : a) {
            System.out.print(i);
        }
    }

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

        int[] a = {9,8,7,6,5,4,3,2,1};
        sortWay(a);
        System.out.println();
        int[] b = {1,2,3,4,5,6,7,8,9};
        sortWay(b);
    }
}
