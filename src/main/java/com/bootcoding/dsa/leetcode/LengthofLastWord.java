package com.bootcoding.dsa.leetcode;

public class LengthofLastWord {
    public static void main(String[] args) {
        String s =  "Hello world";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length-1];

        return lastWord.length();
    }
}
