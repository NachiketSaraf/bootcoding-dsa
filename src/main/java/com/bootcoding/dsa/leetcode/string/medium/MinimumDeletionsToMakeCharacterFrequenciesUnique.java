package com.bootcoding.dsa.leetcode.string.medium;

import java.util.HashSet;
import java.util.Set;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
//    public static void main(String[] args) {
//        String s = "ceabaacb";
//        System.out.println(minDeletions(s));
//    }
    public static int minDeletions(String s) {
        int deleteCount =0;

        int[] freqHash = new int[26];
        for (char c: s.toCharArray()) {
            freqHash[c-'a']++;
        }

        Set<Integer> uniqueFrequency = new HashSet<>();

        for (int count : freqHash){
            while (count > 0 && uniqueFrequency.contains(count)){
                deleteCount++;
                count--;
            }
            uniqueFrequency.add(count);
        }
        return deleteCount;
    }
}
