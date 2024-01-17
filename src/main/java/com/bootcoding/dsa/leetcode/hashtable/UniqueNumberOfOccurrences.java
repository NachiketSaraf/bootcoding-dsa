package com.bootcoding.dsa.leetcode.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();

        for (int n:arr) {
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        Set<Integer> check = new HashSet<>();
        for (int n : freq.values()){
            check.add(n);
        }

        return freq.size() == check.size();
    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();

        for (int n:arr) {
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        Set<Integer> check = new HashSet<>();
        for (int n : freq.values()){
            if (check.contains(n)) return false;
            else check.add(n);
        }

        return true;
    }
}
