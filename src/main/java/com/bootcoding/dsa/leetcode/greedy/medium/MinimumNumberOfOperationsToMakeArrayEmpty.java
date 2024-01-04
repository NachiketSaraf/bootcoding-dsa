package com.bootcoding.dsa.leetcode.greedy.medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int count=0;
        Map<Integer,Integer> freq= new HashMap<>();
        for(int n : nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        for(int v:freq.values()){
            if(v%3==0){
                count += v/3;
            }else if(v%2==0){
                count += v/2;
            }  else{
                return -1;
            }
        }
        return count;
    }
}
