package com.nt.basic;

import java.util.Arrays;

public class Test06BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {35, 5, 7, 45, 60, 4};
        int[] a = {5, 7, 45, 60};
        //call sorting method
        bubbleSort(arr);

        //call print method
        printArray(arr);

    }//main()

    /*
     * This method gives ascending order
     */
    public static void bubbleSort(int[] arr) {
        boolean isSwap;
        //iterate the array from o to n
        for (int i = 0; i < arr.length - 1; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                //comparing each pair of elements
                if (arr[j] > arr[j + 1]) {       // e.g. 35>5 => true
                    //if conditions is true then swap the numbers
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap)
                break;
        }
    }//bubbleSort()


    /*
     * This method gives descending order
     */
    public static void bubbleSortByDesc(int[] arr) {
        boolean isSwap;
        //iterate the array from o to n
        for (int i = 0; i < arr.length - 1; i++) {
            isSwap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                //comparing each pair of elements
                if (arr[j] < arr[j + 1]) {       // e.g. 35>5 => true
                    //if conditions is true then swap the numbers
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap)
                break;
        }
    }//bubbleSort()

    public static void printArray(int[] array) {
        Arrays.stream(array).forEach(p -> System.out.print(p + " "));
    }

}
