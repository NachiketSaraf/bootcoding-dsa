package com.bootcoding.dsa.leetcode.array;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int n = numIdenticalPairs(nums);
        System.out.println(n);

    }
    public static int numIdenticalPairs(int[] nums) {
        int c = 0 ;
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1; j < nums.length ; j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
        }
        return c;
    }
}


