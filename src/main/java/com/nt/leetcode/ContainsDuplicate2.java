package com.nt.leetcode;

import java.util.HashMap;
import java.util.Map;

/* Problems given is
 *
 *
 *
 */
public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] num={1,2,3,1};  //true
        int[] n={1,2,3,1,2,3};
        System.out.println(isContainDuplicate(n,2));
    }
    public static boolean isContainDuplicate(int[] arr,int k){
        Map<Integer,Integer> hm= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])){
               hm.put(arr[i],i );
            }else{
                int pastIndex=hm.get(arr[i]);
                if (Math.abs(pastIndex-i)<=k)
                    return true;
                else
                    hm.put(arr[i],i);
            }
        }//for
        return false;

    }
}
