package com.bootcoding.dsa.leetcode.hashtable;

import java.util.HashMap;

public class TribonacciNumber {
    public static void main(String[] args) { long start = System.currentTimeMillis();
        System.out.println(tribonacci(4));
        System.out.println("Time "+(System.currentTimeMillis()-start));
    }
    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static int tribonacci(int num) {
        if (num == 0) return 0;
        if(num == 1 || num ==2) return 1;
        if (cache.containsKey(num)) return cache.get(num);
        int res = tribonacci(num - 1) + tribonacci(num - 2) + tribonacci(num-3);
        cache.put(num,res);
        return cache.get(num);
    }
}
