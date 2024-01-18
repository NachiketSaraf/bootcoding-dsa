package com.bootcoding.dsa.leetcode;

import java.util.HashMap;

public class ClimbingStairs {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(climbStairs(3));
        System.out.println("Time "+(System.currentTimeMillis()-start));
    }
    static HashMap<Integer, Integer> cache = new HashMap<>();
    public static int climbStairs(int n) {
        if(n==0 || n==1) return 1;
        if (cache.containsKey(n)) return cache.get(n);
        cache.put(n,climbStairs(n-1)+climbStairs(n-2));
        return cache.get(n);
    }
}
