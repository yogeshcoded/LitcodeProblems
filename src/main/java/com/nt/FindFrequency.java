package com.nt;

import java.util.HashMap;
import java.util.Map;

public class FindFrequency {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1,5,2,3,4,7,2,2,2,2,3};
        findFrequency(arr);
    }
    public static void findFrequency(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for (Map.Entry entry:hm.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
