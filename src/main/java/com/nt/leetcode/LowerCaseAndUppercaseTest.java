package com.nt.leetcode;/*
*Convert Uppercase letter to lowercase
* and vice versa
**/

public  class LowerCaseAndUppercaseTest {
    public static void main(String[] args) {
        System.out.println(toLowercase("HELLO"));
        System.out.println(toUppercase("hello"));
    }
    public static String toLowercase(String string){
        StringBuilder sb=new StringBuilder();
        for (char c:string.toCharArray()){
            if (c >= 65 && c<=90){
               c=(char) (c+32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
    public static String toUppercase(String string){
        StringBuilder sb=new StringBuilder();
        for (char c:string.toCharArray()){
            if (c >= 97 && c<=122){
               c=(char) (c-32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
