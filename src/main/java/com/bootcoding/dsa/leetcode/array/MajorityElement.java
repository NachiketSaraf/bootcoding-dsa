package com.bootcoding.dsa.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,3,1,1,4,1,1,5,1,1,6,2,2};
        int n =majorityElement(nums);
        System.out.println(n);
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = nums[0];
        HashMap<Integer,Integer> dup = new HashMap<>();
        for (int i = 0 ; i < nums.length;i++){
            if (dup.containsKey(nums[i])){
                int value = dup.get(nums[i]);
                dup.put(nums[i],value+1);
            }else {
                dup.put(nums[i] , 1);
            }
        }
        for (Integer key : dup.keySet()){
            int value = dup.get(key);
            if(value>(nums.length/2)) {
                max=key;
            }
        }
        return max;
    }
}
