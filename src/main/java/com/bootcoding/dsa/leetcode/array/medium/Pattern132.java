package com.bootcoding.dsa.leetcode.array.medium;

public class Pattern132 {
    public static void main(String[] args) {

    }
    public static boolean find132pattern(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] < nums[k] && nums[k] < nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
