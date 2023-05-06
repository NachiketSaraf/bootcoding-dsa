package com.bootcoding.dsa.leetcode.array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] a =  moveZeroes(new int[]{0,1,0,3,12});
        for (int i = 0; i<= a.length;i++) System.out.println(a[i]);
    }
    public static int[] moveZeroes(int[] nums) {
        int tmp = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=0) {
                nums[tmp]=nums[i];
                tmp++;
            }
        }
        while (tmp< nums.length)
        {
         nums[tmp]=0;
         tmp++;
        }
        return nums;

    }
}
