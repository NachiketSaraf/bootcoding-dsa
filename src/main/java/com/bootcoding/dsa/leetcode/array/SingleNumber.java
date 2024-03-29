package com.bootcoding.dsa.leetcode.array;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums) xor = xor ^ num;
        return xor;
    }
}
