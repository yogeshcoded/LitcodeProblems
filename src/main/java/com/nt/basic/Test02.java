package com.nt.basic;

import java.util.Arrays;
//Remove Even Integers from an Array
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int oddCount = 0;
        for (int n : arr) {
            if (n % 2 != 0)
                oddCount++;
        }

        int[] a = new int[oddCount];
        int idx = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                a[idx] = j;
                idx++;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}