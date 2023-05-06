package com.bootcoding.dsa.leetcode.array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums) xor = xor ^ num;
        return xor;
    }
}
