package com.bootcoding.dsa.leetcode.array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] a =  moveZeroes(nums);
        for (int i = 0; i<= a.length;i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] moveZeroes(int[] nums) {
        int temp = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=0) {
                nums[temp]=nums[i];
                temp++;
            }
        }
        while (temp< nums.length)
        {
         nums[temp]=0;
         temp++;
        }
        return nums;

    }
}
