package com.bootcoding.dsa.leetcode.string;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder completeString = new StringBuilder();
        for (String word : words){
            completeString.append(new StringBuilder(word).reverse().append(" "));
        }
        return completeString.toString().trim();
    }
}
