package com.nt.basic;


import java.util.Arrays;

public class Test010QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40};
        quickSort(arr, 0, arr.length-1);
        display(arr);
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivot;
            pivot = partition(a, low, high);
            quickSort(a, low, pivot - 1);
            quickSort(a, pivot + 1, high);
        }

    }

    private static int partition(int[] a, int low, int high) {
        // choose the rightmost element as pivot
        int pivot = a[high];
        // pointer for greater element
        int i = low - 1;
        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j <= high; j++) {
            if (a[j] < pivot) {
                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;
                // swapping element at i with element at j
                swap(a, i, j);
            }
        }
        // swapt the pivot element with the greater element specified by i
        swap(a, i + 1, high);
        // return the position from where partition is done
        return (i + 1);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void display(int[] a) {
        Arrays.stream(a).forEach(p-> System.out.print(p+" "));
    }

}
