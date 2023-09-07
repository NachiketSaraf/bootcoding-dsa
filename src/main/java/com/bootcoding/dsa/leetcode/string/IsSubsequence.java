package com.bootcoding.dsa.leetcode.string;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int j  = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j)==t.charAt(i)) j++ ;
            if (j==s.length()) return true;
        }
        return false;
    }
}
