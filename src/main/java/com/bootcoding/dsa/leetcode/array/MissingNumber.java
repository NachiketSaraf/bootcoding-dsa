package com.bootcoding.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
//        int n = nums.length;
//        int standerdSum = n*(n+1)/2;
//        int aSum = Arrays.stream(nums).sum() ;
//        return (standerdSum-aSum);


        return ((nums.length*(nums.length+1)/2) - (Arrays.stream(nums).sum()));
    }
}
