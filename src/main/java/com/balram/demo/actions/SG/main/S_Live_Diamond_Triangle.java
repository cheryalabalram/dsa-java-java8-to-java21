package com.balram.demo.actions.SG.main;

public class S_Live_Diamond_Triangle {

    public static void main(String[] args) {
        //  *
        // ***
        // *****

        int n = 5; //assume 5/2 =
        int skip = n / 2;
//        for (int i = 0; i < n; i++) {
//            if( i % 2 != 0){
//                System.out.print(" ");
//            }
//            for (int j = 0; j < n/2; j++) {
//                System.out.print("*");
//            }
//            if(i != skip){
//                System.out.print("*");
//            }
//            for (int j = 0; j < n; j++) {
//                if(i == skip){
//                    System.out.print(" ");
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//        }
        // Print the upper half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
