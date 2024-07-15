package com.nt.leetcode;



public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};   //input
        //  int[] op = {5, 6, 7, 1, 2, 3, 4};   //output
      rotateArray(a,10);

    }

    public static void rotateArray(int[] arr, int k) {
          int n= arr.length;
          k=k%n;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

}
