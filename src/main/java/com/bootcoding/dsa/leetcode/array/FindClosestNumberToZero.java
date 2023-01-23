package com.bootcoding.dsa.leetcode.array;

public class FindClosestNumberToZero {
    public static void main(String[] args) {
            int[] nums = {-10,-12,-54,-12,-544,-10000};
            int ans = findClosestNumber(nums);
        System.out.println(ans);
    }
    public static int findClosestNumber(int[] nums) {
        int close = Math.abs(nums[nums.length-1]);
        for (int i = 0; i < nums.length ; i++){
            int sub = Math.abs(nums[i]);

            if (sub < close){
                close = sub;
            }
        }
        return close;
    }
}
