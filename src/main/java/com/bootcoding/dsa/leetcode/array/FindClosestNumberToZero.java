package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class FindClosestNumberToZero {
    public static void main(String[] args) {
            int[] nums = {-10,-12,-54,-12,-544,-10000};
            int ans = findClosestNumber(nums);
        System.out.println(ans);
    }
    public static int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int positive = 0;
        int negative = nums[0];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                positive = nums[i];
                break;
            }
            if(nums[i] == 0) {
                return 0;
            }
            negative = nums[i];
        }
        if(Math.abs(negative) < positive){
            return negative;
        }
        if(positive == 0){
            return nums[n - 1];
        }
        return positive;
    }
}
