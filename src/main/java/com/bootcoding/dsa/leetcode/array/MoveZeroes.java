package com.bootcoding.dsa.leetcode.array;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

    }
    public static void moveZeroes(int[] nums) {
        int temp ;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                temp = nums[i];


                nums[nums.length-1]=nums[i];


            }
        }

    }
}
