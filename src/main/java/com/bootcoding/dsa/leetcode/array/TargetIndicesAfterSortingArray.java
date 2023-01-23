package com.bootcoding.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        List<Integer> n = targetIndices(nums,target);
        for (int i = 0 ; i < n.size();i++){
            System.out.println(n.get(i));
        }
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> index = new ArrayList<>();
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                index.add(i);
            }
        }
        return index;
    }
}
