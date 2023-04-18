package com.bootcoding.dsa.leetcode.string;

import java.util.*;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        //String s = "bcdbc";
        System.out.println(removeDuplicateLetters("bcdbc"));
    }
    public static String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set =new HashSet<>();
        for (int i = 0; i < s.length(); i++) set.add(s.charAt(i));
        for (char ch: set) sb.append(ch);
        return sb.toString();
    }
}
