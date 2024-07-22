package com.nt.basic;

import java.util.Arrays;

/*
 * Merge two sorted array
 */
public class Test08TwoWayMarge {
    public static void main(String[] args) {
        int[] b = {5, 10, 11, 13};
        int[] a = {2, 3, 8, 15, 17, 21};
        System.out.println(Arrays.toString(twoWayMerge(a, b)));
    }

    public static int[] twoWayMerge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                c[k] = b[j];
                j++;
            } else {
                c[k] = a[i];
                i++;
            }
            k++;
        }
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
        return c;
    }
}
