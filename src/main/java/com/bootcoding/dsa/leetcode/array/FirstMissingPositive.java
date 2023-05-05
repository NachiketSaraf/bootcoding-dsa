package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int[] check;
        if (nums.length <= nums[nums.length-1]+1) check = new int[nums.length + 1];
        else check = new int[nums[nums.length - 1] + 1];

        for (int num : nums) if (num > 0) check[num] += 1;
        for (int j = 1; j < check.length; j++) {
            if (check[j]==0) return j;
        }
        return 1;
    }
}
