package com.bootcoding.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        List<String> ans = summaryRanges(new int[]{0,1,2,4,5,7});
        for (String s: ans) {
            System.out.println(s);
        }
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if (nums.length == 0) return ans;
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length;) {
            start =i;
            end=i;
            while (end < (nums.length-1) && nums[end] +1 == nums[end+1]) end++;
            if (end>start) ans.add(nums[start] + "->" + nums[end]);
            else ans.add(String.valueOf((nums[start])));
            i = end+1;
        }
        return ans;
    }
}
