package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int[] check;
        if (nums.length <= nums[nums.length-1]+1){
             check = new int[nums.length+1];
        }
        else {
             check = new int[nums[nums.length - 1] + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) {
                check[nums[i]] +=1;
            }

        }
        for (int j = 1; j < check.length; j++) {
            if (check[j]==0){
                return j;
            }
        }
        return 1;
    }
}
