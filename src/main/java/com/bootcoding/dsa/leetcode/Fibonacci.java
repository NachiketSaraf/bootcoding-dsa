package com.bootcoding.dsa.leetcode;

import java.util.HashMap;

public class Fibonacci {
    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fibMemoization(2));

    }
    // Using Normal recursion
    public static int fib(int n ){
        if (n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    // Using Memoization
    public static int fibMemoization(int n){
            if(n==0 || n==1){
                return n;
            }
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
            cache.put(n,fibMemoization(n-1)+fibMemoization(n-2));
            return cache.get(n);
    }


}
