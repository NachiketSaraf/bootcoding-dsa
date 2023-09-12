package com.bootcoding.dsa.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    public static void main(String[] args) {
        List<List<Integer>> ans = groupThePeople(new int[] {3,3,3,3,3,1,3});
        for (List<Integer> n:ans) {
            System.out.println(n);
        }

    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        int max = Arrays.stream(groupSizes).max().getAsInt();

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            List<Integer> subAns= new ArrayList<>();
            for (int j = 0; j < groupSizes.length; j++) {
                if (groupSizes[j]==i){
                    if (subAns.size() >= i){
                        ans.add(subAns);
                        subAns = new ArrayList<>();
                    }
                    subAns.add(j);
                }
            }
            if (subAns.size() != 0) ans.add(subAns);
        }
        return ans;
    }
}
