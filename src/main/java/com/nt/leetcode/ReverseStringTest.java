package com.nt.leetcode;

public class ReverseStringTest {
    public static void main(String[] args) {
        String str = "Hello My Name";
        System.out.println(reverse(str));
    }

    public static String reverse(String string) {
        char[] charArray = string.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start <= end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(charArray);
    }



    }

