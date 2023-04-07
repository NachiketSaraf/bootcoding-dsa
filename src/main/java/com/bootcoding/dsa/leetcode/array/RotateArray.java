package com.bootcoding.dsa.leetcode.array;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
    }public static void rotate(int[] nums, int k) {
        while (k!=0){
            int temp = nums[nums.length-1];
            for (int i= nums.length-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0]=temp;
            k--;
        }
        print(nums);
    }
    public static void print(int[] nums){
        for (int i = 0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
