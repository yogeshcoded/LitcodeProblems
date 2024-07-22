package com.nt.basic;

// Java program for Merge Sort

public class Test09MergeSort {

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int[] e = new int[n1];
        int[] f = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            e[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            f[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (e[i] <= f[j]) {
                arr[k++] = e[i++];
            } else {
                arr[k++] = f[j++];
            }
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k++] = e[i++];

        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k++] = f[j++];

        }
    }

    // Main function that sorts arr[l..r] using
    // merge(
    public void sort(int arr[], int l, int r) {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // A utility function to print array of size n
    public static void printArray(int[] arr) {
        for (int i:arr)
            System.out.print(i + " ");
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {6,5,3,1,8,7,2,4};

        Test09MergeSort ob = new Test09MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\n Sorted array is");
        printArray(arr);
    }
}

