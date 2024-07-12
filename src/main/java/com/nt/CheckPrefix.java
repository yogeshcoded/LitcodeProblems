package com.nt;

public class CheckPrefix {
    public static void main(String[] args) {
        String sentence="i love eating burger";
        String prefix="burg";
        System.out.println(checkPrefix(sentence,prefix));
    }
    public static int checkPrefix(String sentence,String prefix){
        String[] words=sentence.split(" ");
        System.out.println("words = " + words[2]);
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(prefix))
                return i+1;
              }
        return -1;
    }

}
