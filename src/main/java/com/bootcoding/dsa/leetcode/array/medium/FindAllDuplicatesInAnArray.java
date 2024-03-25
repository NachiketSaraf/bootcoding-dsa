package com.bootcoding.dsa.leetcode.array.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        System.out.println(findDuplicates(new int[] {4,3,2,7,8,2,3,1}));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(Integer i:nums){
            map.put(i,map.getOrDefault(i,0) +1 );
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==2){
                ans.add(key);
            }
        }
        return ans;
    }
}
