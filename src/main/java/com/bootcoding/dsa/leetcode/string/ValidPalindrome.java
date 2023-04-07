package com.bootcoding.dsa.leetcode.string;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        if(s.length()==0) return true;

        s = s.toLowerCase();
        StringBuilder s1 = new StringBuilder();

        for (int i = 0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))){
                s1.append(s.charAt(i));
            }
        }
        s1.toString();
        int j = s1.length()-1;
        for (int i = 0; i < s1.length();i++){
            if (s1.charAt(i)==s1.charAt(j)){
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
