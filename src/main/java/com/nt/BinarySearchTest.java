package com.nt;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,10};
        System.out.println(binarySearch(arr,2));
    }

    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target)
                return true;
           else if (arr[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return arr[low] == target;
    }


    }

