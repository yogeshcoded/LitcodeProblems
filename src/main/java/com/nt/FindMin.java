package com.nt;

import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
        int[] num = {50, 87, 9, 10};
        System.out.print(Arrays.toString(findMin(num)));
    }

    public static int[] findMin(int[] a) {
        int minIndex;
        for (int i = 0; i < a.length-1; i++) {
            minIndex=i;       //i=1
            for (int j =i+1; j < a.length ; j++) { // j=1+1=2; 2<4;j++
                if (a[minIndex] > a[j])    //a[1]>a[2]==>>87>9
                    minIndex = j;          //m=2
            }
                //swap the no
                int temp=a[minIndex];   //temp=a[2]=9
                a[minIndex]=a[i];       // a[2]=a[1] ==>87=9
                a[i]=temp;             //a[1]=9
            }
        return a;
    }

    }


