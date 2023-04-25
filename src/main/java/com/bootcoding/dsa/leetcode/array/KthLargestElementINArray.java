package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class KthLargestElementINArray {
    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4, 2}, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int largestElement = nums[nums.length - k];
        return largestElement;
    }

}
