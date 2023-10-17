package com.bootcoding.dsa.leetcode.hashtable.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    public static void main(String[] args) {
//        int[] a=;
        majorityElement(new int[]{3,2,3});

        
        
    }
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> elementCount = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            if(!elementCount.containsKey(nums[i])){
                elementCount.put(nums[i],1);
            }
            else {
                elementCount.put(nums[i], elementCount.get(nums[i]) +1);
            }
        }
        int threshold = nums.length/3;
        List<Integer> selectedElements =new ArrayList<>();

        for (Integer n: elementCount.keySet()) {
            if (elementCount.get(n)>threshold){
                selectedElements.add(n);
            }
        }
        return selectedElements;
    }
}
