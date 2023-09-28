//package com.bootcoding.dsa.leetcode.string.medium;
//
//import java.util.*;
//
//public class RemoveDuplicateLetters {
//
//    public static void main(String[] args) {
//
//    }
//    public String removeDuplicateLetters(String s) {
//        Map<Character,Integer> frequency  = new HashMap<>();
//        Stack<Character> stack = new Stack<>();
//        boolean[] seen = new boolean[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            char c =s.charAt(i);
//            if (frequency.containsKey(c)){
//                frequency.put(c, frequency.get(c)+1);
//            }
//            else frequency.put(c,1);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            char c =s.charAt(i);
//            if (seen[c-'a']) {
//
//            }
//        }
//    }
//}
