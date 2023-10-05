package com.bootcoding.dsa.leetcode.string;

public class ReverseWordsStringIII {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder completeString = new StringBuilder();
        for (String word : words){
            completeString.append(new StringBuilder(word).reverse().append(" "));
        }
        return completeString.toString().trim();
    }
}
