package com.bootcoding.dsa.leetcode.hashtable;

import java.util.HashMap;

public class TribonacciNumber {
    public static void main(String[] args) { long start = System.currentTimeMillis();
        System.out.println(tribonacci(4));
        System.out.println("Time "+(System.currentTimeMillis()-start));
    }
    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if(n == 1 || n ==2) return 1;
        if (cache.containsKey(n)) {
            return cache.get(n);
        }
        int res = tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n-3);
        cache.put(n,res);
        return cache.get(n);
    }
}
