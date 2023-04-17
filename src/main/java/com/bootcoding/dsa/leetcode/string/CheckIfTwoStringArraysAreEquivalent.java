package com.bootcoding.dsa.leetcode.string;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[]  word1 = {"ab", "c"};
        String[]  word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1==null || word2==null) return false;

        String word1Sum ="";
        String word2Sum ="";

        for (int i = 0; i < word1.length ; i++) {
            word1Sum += word1[i];
        }

        for (int i = 0; i < word2.length ; i++) {
            word2Sum += word2[i];
        }
        return word1Sum.equals(word2Sum);
    }
}
