package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {5,2,2};
        System.out.println(thirdMax(nums));
    } public static int thirdMax(int[] nums) {

        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        if (nums.length==1){
            thirdMax=nums[0];
        }
        for (Integer n : nums){

            if(n.equals(firstMax)||n.equals(secondMax)||n.equals(secondMax)){
                continue;
            }
            if (firstMax == null || n>firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (secondMax == null || n>secondMax) {
                thirdMax = secondMax;
                secondMax = n;

            } else if (thirdMax == null || n>thirdMax) {
                thirdMax = n;
                break;
            }
        }
        if (thirdMax == null) {
            return firstMax;
        }
        return thirdMax;
    }
}








//
//    int max = nums[0];
//        for (int i = 0 ; i <= nums.length-1;i++){
//                if(i <= 3){
//                if(i< nums.length-1) {
//        if (nums[i] == nums[i + 1]) {
//        max = nums[i];
//        }
//        }
//        else {
//        max = nums[i];
//        }
//        }else{
//        break;
//        }
//        }
//        return max;
