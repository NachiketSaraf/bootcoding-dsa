package com.bootcoding.dsa.leetcode.array.medium;

import java.util.Arrays;

public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int reachable = 0;
        for (int i = 0; i < n; i++) {
            if (reachable < i){
                return false;
            }
            reachable = Math.max(reachable,i+nums[i]);
        }
        return true;
    }

//    public static boolean canJump(int[] nums) {
//        int goal = nums.length-1;
//        for (int i = nums.length-1;i>=0;i--){
//            if (i+nums[i] >= goal){
//                goal = i;
//            }
//        }
//        return goal==0?true:false;
////        if (goal==0) return true;
////        return false;
//    }


//    public static boolean canJump(int[] nums) {
//        int n = nums.length;
//        int[] dp = new int[n];
//        Arrays.fill(dp,-1);
//        return jumpFrom(0,nums,dp);
//    }
//    public static boolean jumpFrom(int index , int[] nums,int[] dp){
//        if(index>=nums.length-1)
//            return true;
//
//        if(dp[index]!=-1)
//            return dp[index]==0?false:true;
//
//        for(int i=1;i<=nums[index];i++){
//            if(jumpFrom(index + i , nums,dp)==true)
//            { dp[index]=1;
//                return true;
//            }
//        }
//
//        dp[index]=0;
//        return false;
//    }
}
