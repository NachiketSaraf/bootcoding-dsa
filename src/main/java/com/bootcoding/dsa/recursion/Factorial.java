package com.bootcoding.dsa.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int f = calculateFactorial(n);
        System.out.println(f);

    }

    private static int calculateFactorial(int n) {
        if (n==1){
            return n;
        }
        return n* calculateFactorial(n -1);
    }
}
