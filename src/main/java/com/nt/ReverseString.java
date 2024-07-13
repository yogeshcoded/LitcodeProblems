package com.nt;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String str = " how  are you? ";
        System.out.println(reverseString(str));
    }

    //using for loop
    public static String reverseString(String str) {
        String[] words=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for (int i = words.length-1; i > 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        // using for each loop
        /*for (String s:words){
            sb.insert(0,s+ " ");
        }*/
        return sb.toString().trim();
    }
    /*public static String reverseString(String str) {
        // Split the input string into words
        String[] words = str.trim().split("\\s+");

        // Reverse the array of words using Java 8 streams
        Collections.reverse(Arrays.asList(words));

        // Join the reversed words into a single string with spaces
        return String.join(" ", words);
    }*/

}
