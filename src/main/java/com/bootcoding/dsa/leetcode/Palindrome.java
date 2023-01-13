package com.bootcoding.dsa.leetcode;

public class Palindrome {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(isPalindrome(x));


    }

    public static boolean isPalindrome(int x) {
        int rem = 0;
        int temp = x;
        while (x > 0) {
            int div = x / 10;
            rem = rem * 10 + x % 10;
            x = div;
        }
        if (rem == temp) {
            return true;
        }
        return false;
    }
}
