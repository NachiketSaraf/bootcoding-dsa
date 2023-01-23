package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] n = sortedSquares(nums);
        for(int i= 0; i< n.length;i++){
            System.out.println(n[i]);
        }
    }
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
