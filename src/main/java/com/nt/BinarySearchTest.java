package com.nt;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(binarySearch(arr,50));
    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low<high){
            int mid=low+(high-low)/2;
            if (arr[mid]<target)
                low=mid+1;
            else
                high=mid;
        }
        return arr[low] == target;
    }


    }

