package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {5,2,2};
        System.out.println(thirdMax(nums));
    } public static int thirdMax(int[] nums) {

        int firstMax = 0;
        int secondMax = 0;
        int thirdMax = 0;
        if (nums.length==1){
            thirdMax=nums[1];
        }
        for (int i = 0; i < nums.length; i++){

            if(firstMax==nums[i]||secondMax==nums[i]||thirdMax==nums[i]){
                continue;
            }
            if (firstMax == 0) {
                firstMax = nums[i];
            } else if (secondMax == 0) {
                secondMax = nums[i];
            } else if (thirdMax == 0) {
                thirdMax = nums[i];
                break;
            }
        }
        if (thirdMax == 0) {
            thirdMax = secondMax;
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
