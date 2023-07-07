package com.bootcoding.dsa.recursion;

public class SumOfNumbers1ToN {
    public static void main(String[] args) {
        int n = 5;

        int s=printSum(n);
        System.out.println(s);

    }

    private static int printSum(int n) {
        if (n==0) return 0;
        return n+ printSum(n-1);
    }
}
