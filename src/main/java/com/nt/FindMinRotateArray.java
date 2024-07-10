package com.nt;

/*
 * Find the minimum element.
 * You may assume no duplicate exists in the array.
 * */
public class FindMinRotateArray {

    public static void main(String[] args) {
        int[] op = {5, 6, 7, 1, 2, 3, 4};
        int[] opt = {4,5,6,7,0,1,2};
        System.out.println(findMin(opt));
    }

    public static int findMin(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;

        }
        return arr[high];
    }
}
