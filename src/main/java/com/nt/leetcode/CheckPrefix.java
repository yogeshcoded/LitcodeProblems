package com.nt.leetcode;

import java.util.stream.IntStream;

public class CheckPrefix {
    public static void main(String[] args) {
        String sentence="i love eating burger";
        String prefix="burg";
        System.out.println(checkPrefix(sentence,prefix));
    }
    public static int checkPrefix(String sentence,String prefix){
        String[] words=sentence.split(" ");
        //using traditional for loop
        /* for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(prefix))
                return i+1;
              }//for*/

        //using for each loop
       /* int index=0;
        for (String w:words){
            if (w.startsWith(prefix))
                return index+1;
            index++;
        }*/

        //using java 8
       int index=IntStream.range(0, words.length)
                .filter(i -> words[i].startsWith(prefix))
                .findFirst().orElse(-1);
        return index!=1?index+1:-1;

    }

}
