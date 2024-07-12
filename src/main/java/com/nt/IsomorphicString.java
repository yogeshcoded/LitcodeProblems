package com.nt;

import java.util.HashMap;

/*
* Check two string are isomorphic or not
* Example:1
* input:"egg","odd"
* output:true
*
* Example:2
* input:"foo","ora"
* output:false
* */
public class IsomorphicString {
    public static void main(String[] args) {
        String s="egg";
        String t="odd";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s,String t){
        if (s.length()!=t.length())
            return false;
        HashMap<Character,Character> hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))){
                if (!hm.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            }else{
                if (hm.containsValue(t.charAt(i))){
                    return false;
                }
                hm.put(s.charAt(i),t.charAt(i));
            }//else
        }//for
        return true;
    }
}
