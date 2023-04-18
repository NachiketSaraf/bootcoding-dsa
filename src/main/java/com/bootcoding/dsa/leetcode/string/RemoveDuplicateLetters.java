package com.bootcoding.dsa.leetcode.string;

import java.util.*;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "bcabc";
        System.out.println(removeDuplicateLetters(s));
    }
    public static String removeDuplicateLetters(String s) {
        StringBuilder sb = new StringBuilder();
        LinkedHashSet<Character> set =new LinkedHashSet();
        Stack stack =new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        for (char ch: set){
            sb.append(ch);
        }
        return sb.toString();
    }
}
