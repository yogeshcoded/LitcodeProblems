package com.nt.basic;

import java.util.Arrays;

public class Test07SelectionSort {
    public static void main(String[] args) {
    int[] arr={10,2,5,3,9,8};
        System.out.println(Arrays.toString(arr));
    }
    public static int[] selectionSort(int[] num){
        int min=0;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i+1; j < num.length; j++) {
                //find minimum number
                if (num[min]>num[j])
                   min=j;
                //swap the numbers
                int temp=num[min];
                num[min]=num[i];
                num[i]=temp;
            }//for2
        }//for1
        return num;
    }

}
