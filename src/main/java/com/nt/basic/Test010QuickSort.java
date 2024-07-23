package com.nt.basic;

import java.util.Stack;

public class Test010QuickSort {
    public static void main(String[] args) {
        String first = "listen";
        String second = "liste";
        char[] characters = first.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(second);

        for(Character ch : characters) {
            int index = stringBuilder.indexOf(""+ch);
            if(index != -1) {
                stringBuilder.deleteCharAt(index);
            }else {
                break;
            }
        }
        System.out.println(stringBuilder.isEmpty() ? "Anagram" : "Not an anagram");

    }
}
