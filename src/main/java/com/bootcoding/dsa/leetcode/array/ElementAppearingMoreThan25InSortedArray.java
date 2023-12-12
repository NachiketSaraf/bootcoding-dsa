package com.bootcoding.dsa.leetcode.array;

import java.util.HashMap;

public class ElementAppearingMoreThan25InSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n :arr) {
                map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Integer k :map.keySet()) {
            if (map.get(k) > arr.length/4 ){
                return k;
            }
        }
        return -1;
    }
}
