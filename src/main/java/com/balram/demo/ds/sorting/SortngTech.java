package com.balram.demo.ds.sorting;

import java.util.Arrays;

public class SortngTech {
    public static void bubbleSort(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = 0; j < ints.length - 1; j++) {
//			for (int j = 0; j < ints.length - i -1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
            System.out.println();
            Arrays.stream(ints).boxed().forEach(System.out::print);
        }
    }


    public static void selectionSort(int[] nums) {
        int minIndex = -1;
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
            System.out.println();
            Arrays.stream(nums).boxed().forEach(System.out::print);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Current element to be positioned
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Place key in its correct position
            System.out.println();
            Arrays.stream(arr).boxed().forEach(System.out::print);
        }
    }
}
