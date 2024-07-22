package com.nt.leetcode;

public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,10};
        System.out.println(binarySearch(arr,4));
        System.out.println(binarySearchRecursive(arr,0,5,10));
    }
//Binary search using iterative approach
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target)
                return mid;
           else if (arr[mid]<target)
               low= mid+1;
            else
                high= mid-1;
        }
        return -1;
    }

//Binary search using recursive approach
    public static int binarySearchRecursive(int[] arr,int low,int high, int target) {
        if (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==target)
                return mid;
           else if (arr[mid]<target)
                return binarySearchRecursive(arr,mid+1,high,target);
            else
                return binarySearchRecursive(arr,low,mid-1,target);
        }
        return -1;
    }



    }

