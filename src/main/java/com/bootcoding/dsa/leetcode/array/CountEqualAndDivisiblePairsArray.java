package com.bootcoding.dsa.leetcode.array;

public class CountEqualAndDivisiblePairsArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,2,2,1,3};
        int n = countPairs(nums, 2);
        System.out.println(n);
    }

    public static int countPairs(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                        c++;
                }
            }
        }
        return c;
    }
}

