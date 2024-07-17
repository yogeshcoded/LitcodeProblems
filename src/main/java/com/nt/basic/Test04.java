package com.nt.basic;

public class Test04 {
    public static void main(String[] args) {
        String name = " my name  is raja ";
        System.out.println(reverse(name));

    }

    public static String reverse(String st) {
        String[] words = st.split(" +");
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
            sb.insert(0, s + " ");
        }
        return sb.toString().trim();
    }
}
