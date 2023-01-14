package com.bootcoding.dsa.leetcode.array;

public class MaximumOfPositiveAndNegative {
    public static void main(String[] args) {

    }
    public int maximumCount(int[] nums) {
        int neg = 0,pos =0;
        for(int i = 0 ;i<=nums.length-1; i++ ){
            if(nums[i]<0){
                neg++;
            }if(nums[i]>0){
                pos++;
            }
        }
        if (pos>neg){
            return pos;
        }
        return neg;
    }
}
