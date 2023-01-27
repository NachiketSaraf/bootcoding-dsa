package com.bootcoding.dsa.leetcode.hashtable;

import java.util.*;

public class FindClosestNumberToZero {
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums) {
        int n = nums[0];
        HashMap<Integer,Integer> major = new HashMap<>();
        for (int i = 0;i < nums.length ; i++){

            if(nums[i]>0) {
                major.put((0 - (nums[i]) * -1), nums[i]);
            }
            else {
                major.put((0 - nums[i]), nums[i]);
            }
        }
        TreeMap<Integer,Integer> tm = new  TreeMap<> (major);
        System.out.println(tm);


        for(Integer key : tm.keySet()) {
            if (tm.get(key)>0){
                n = tm.get(key);

            }
        }
        return n;
    }


}
