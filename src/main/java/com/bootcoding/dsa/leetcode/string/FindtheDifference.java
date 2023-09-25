package com.bootcoding.dsa.leetcode.string;

public class FindtheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }
    public static char findTheDifference(String s, String t) {
        char ex =0;
        for (char c: s.toCharArray()) {
            ex ^= c;
        }
        for (char ct :t.toCharArray()){
            ex ^= ct;
        }
        return ex;
    }
}
