package com.bootcoding.dsa.leetcode.recursion;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 8;
        boolean res = isPowerOfTwo(n);
        System.out.println(res);
    }
    public static boolean isPowerOfTwo(int n) {
        if (n==1){
            return true;
        }if (n==0||n%2==1){
            return false;
        }
        return isPowerOfTwo(n/2);

    }
}
