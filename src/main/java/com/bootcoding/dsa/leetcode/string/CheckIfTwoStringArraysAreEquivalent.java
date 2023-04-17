package com.bootcoding.dsa.leetcode.string;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[]  word1 = {"ab", "c"};
        String[]  word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1==null || word2==null) return false;

        StringBuilder word1Sum = new StringBuilder();
        StringBuilder word2Sum = new StringBuilder();

        for (String s : word1) word1Sum.append(s);

        for (String s : word2) word2Sum.append(s);

        return word1Sum.toString().contentEquals(word2Sum);
    }
}
