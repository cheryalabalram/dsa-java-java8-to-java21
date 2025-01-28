package com.balram.demo.actions.MoJo;

import java.util.*;

public class TechMojo {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 4, 3, 9, 2, 5, 3, 4, 2, 9, 1, 8, 9 };
        // 2

        List<Integer> list = new ArrayList<>();
        for (int i : arr){
            list.add(i);
        }

//        Set<Integer> set = new HashSet<>();
//
//
//        List<Map.Entry<Integer, Long>> collect = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(e -> e.getValue() >= 3)
//                .collect(Collectors.toList());
//
//        System.out.println(collect);


//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {5, 9, 4, 2};
//
//        //Just debug
//        justSort(arr2);

//        String query = "fl";
//        String[] arr = {"flower","carflow","abcfdel"};
//
//        for (String s : arr) {
//            char[] charArray = s.toCharArray();
//            for (int i = 1; i < arr.length; i++) {
//                for (char c : charArray) {
//                    if(arr[i].contains(""+c)){
//                        System.out.print(""+c);
//                    }
//                }
//            }
//
//        }


    }

//    public static  void sortThenMerge(int[] first, int[] second){
//
//    }
//
//    public static void justSort(int[] input){
//        for (int i = 0; i < input.length; i++) {
//            int temp = input[i];
//            for (int j = 0; j < input.length; j++) { // 2 5
//                if(input[i] > input[i] + 1){
//                    temp =  input[i];
//                    input[i] = temp;
//                }
//            }
//        }
//
//        System.out.println(input);
//    }



}
