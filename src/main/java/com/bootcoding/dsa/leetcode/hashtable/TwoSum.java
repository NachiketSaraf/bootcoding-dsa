package com.bootcoding.dsa.leetcode.hashtable;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int[] indx = twoSum(nums,9);
        for (int i = 0; i < indx.length; i++ ){
            System.out.println(indx[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> ind = new  HashMap<>();
        for (int i = 0; i < nums.length;i++ ){
            if (ind.containsKey(target-nums[i])){
                ans[0] = ind.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            else ind.put(nums[i], i);
        }

        return ans;
    }
}
