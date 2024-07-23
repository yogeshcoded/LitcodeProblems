package com.nt.basic;

import java.util.Arrays;

public class Test07SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3, 9, 8};
        //call sort method
        selectionSort(arr);

        //print the data
        printArray(arr);

    }

    //selection sort ascending order
    public static void selectionSort(int[] num) {
        int min;
        //iterate the array from o to n
        for (int i = 0; i < num.length - 1; i++) {
            //let assume min element present in i index
            min = i;
            //find minimum value in the list
            for (int j = i + 1; j < num.length; j++) {
                if (num[min] > num[j])
                    min = j;
            }//inner for
            //swap the numbers
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }//for1
    }
    //selection sort descending order
    public static void selectionSortByDesc(int[] num) {
        int min;
        //iterate the array from o to n
        for (int i = 0; i < num.length - 1; i++) {
            //let assume min element present in i index
            min = i;
            //find minimum value in the list
            for (int j = i + 1; j < num.length; j++) {
                if (num[min] < num[j])
                    min = j;
            }//inner for
            //swap the numbers
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }//for1
    }

    public static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(p -> System.out.print(p + " "));
    }

}
