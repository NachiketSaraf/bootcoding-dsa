package com.bootcoding.dsa.leetcode.hashtable;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        int[] output = frequencySort(nums);
    }
    public static int[] frequencySort(int[] nums) {
        int[] res = new int[nums.length];
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int i = 0 ; i < nums.length;i++){
            if (frequency.containsKey(nums[i])) {
                int value = frequency.get(nums[i]);
                frequency.put(nums[i],value+1);
            }else {
                frequency.put(nums[i],1);
            }
        }
        for (Integer n : frequency.keySet()){
            System.out.print(n + " ");
            System.out.print(frequency.get(n));
            System.out.println();
        }



// if (value of one or more no have same frequency){
//        print max them
//        followed with the min
//        for(Integer n : frequency.keySet()){
//            if (frequency.containsValue(1)){
//
//            }
//        }

        return res;
    }
}
