package com.nt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Problems given is
 * If the duplicate number contains
 * in arr then return true otherwise false
 *
 * Example 1:
 * [1,2,3,4,1,2] //input
 * output: true
 *
 * Example 2:
 * [1,2,3,4] //input
 * output: false
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 1, 2};
        int[] n = {1, 2, 3, 4};
        System.out.println(isContains(num));
        System.out.println(isContain(n));
    }

    public static boolean isContains(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (hs.contains(arr[i]))
                return true;
            hs.add(arr[i]);
        }
        return false;
    }
/*same approach using Hashmap*/
    public static boolean isContain(int[] arr) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (hm.containsKey(arr[i]))
                return true;
            hm.put(arr[i], i);
        }

        return false;
    }
}
