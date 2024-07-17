package com.nt.basic;

import java.util.Arrays;

public class Test06_Bubble_Sort_Algorithm {
    public static void main(String[] args) {
        int[] arr = {35, 5, 7, 45, 60, 4};
        int[] ar = {5, 7, 45, 60};

        System.out.println(Arrays.toString(bubbleSort(ar)));


    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted)
                break;
        }
        return arr;
    }


}
