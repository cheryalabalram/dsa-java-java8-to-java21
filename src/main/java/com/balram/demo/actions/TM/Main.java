package com.balram.demo.actions.TM;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main {

    //Problem Statement #
    //Given an array of positive numbers and a positive number ‘k,’
    //find the maximum sum of any contiguous subarray of size ‘k’.
    //Example 1:
    //Input: [2, 1, 5, 1, 3, 2], k=3
    //Output: 9
    //Explanation: Subarray with maximum sum is [5, 1, 3].
    //Example 2:
    //Input: [2, 3, 4, 1, 5], k=2
    //Output: 7
    //Explanation: Subarray with maximum sum is [3, 4].


    //k-> 3
    //arr.length 1st 3 -> update sum & break

    public static void print(int[] inputArray, int k){
        Map<Integer, Integer> holder = new HashMap<>();
//        for (int i = 0; i < inputArray.length - k; i++) {
//        for (int i = 0; i <= inputArray.length - k; i++) {
        for (int i = 0; i < inputArray.length; i++) {
            int localSum = 0;
//            for (int j = i; j < i + k; j++) {
            for (int j = i; j <= k; j++) {
                localSum += inputArray[j]; //2 + 1 + 5
            }
            holder.put(i, localSum);
        }
        Optional<Map.Entry<Integer, Integer>> max = holder
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(e -> e.getValue()));

        System.out.println(max);

    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
//        int arr[] = {2, 3, 4, 1, 5};
//        int k = 2;
        print(arr, k);
    }
}