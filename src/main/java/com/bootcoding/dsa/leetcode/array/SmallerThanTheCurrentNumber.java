package com.bootcoding.dsa.leetcode.array;

public class SmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] n = smallerNumbersThanCurrent(nums);
        for (int i = 0 ; i < n.length;i++){
            System.out.println(n[i]);
        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] nums1 = new int[nums.length];
        for (int i = 0  ; i < nums.length ; i++){
            int c = 0;
            for (int j = 0 ; j<nums.length;j++){
                if (nums[j]<nums[i]){
                    c++;
                }
            }
            nums1[i]=c;
        }
        return nums1;
    }
}
