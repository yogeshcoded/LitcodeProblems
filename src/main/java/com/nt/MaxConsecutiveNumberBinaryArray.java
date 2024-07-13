package com.nt;

public class MaxConsecutiveNumberBinaryArray {
    public static void main(String[] args) {
        int[] n={1,1,0,1,1,1};
        int[] np={1,0,1,1,0,1};
        System.out.println(maxConsecutiveNumber(n));
    }

    public static int maxConsecutiveNumber(int[] num){
        int curr_count=0;
        int max_count=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]==1){
                curr_count++;
                max_count=Math.max(max_count,curr_count);
            }else
                curr_count=0;
        }
        return max_count;
    }


}
