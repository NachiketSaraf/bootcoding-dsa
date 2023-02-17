package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int[] a = {7,5,6,8,3};
        System.out.println(findGCD(a));
    }
    public static int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        while (min > 0 && max > 0){
            if (min>max)
                min = min%max;
            else
                max=max%min;
        }
        if (min==0)
            return max;
        else
            return min;
    }
}
