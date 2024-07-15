package com.nt.basic;
//find minimum element from array
public class Test03{
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 48, 5, 6, 7, 8, 9, 10,12,36};


        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
       // System.out.println(findMedElement(arr));
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max=arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>max)
//                max=arr[i];
//        }
         for (int i:arr){
             if (i>max)
                 max=i;
         }
        return max;
    }
    public static int findMedElement(int[] arr){
        return arr[0+((arr.length-1)-0)/2];

}
}
