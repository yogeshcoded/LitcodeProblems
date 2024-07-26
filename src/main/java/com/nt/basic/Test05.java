package com.nt.basic;

public class Test05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};  //rotate 3 times k=3
        //output 5,6,7,1,2,3,4

        rotateArray(arr,3);
    }

    public static void rotateArray(int[] num, int k) {
        int n = num.length-1;
        k = k % n;
        reverse(num, 0, n);
        reverse(num, 0, k - 1);
        reverse(num, k, n);

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
