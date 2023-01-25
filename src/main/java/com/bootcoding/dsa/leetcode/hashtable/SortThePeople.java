package com.bootcoding.dsa.leetcode.hashtable;

import java.util.*;

public class SortThePeople {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] hights = {180,165,170};
        Object[] name =  sortPeople(names,hights);
        for (int i = 0; i<name.length;i++) {
            System.out.println(name[i]);
        }
    }
    public static Object[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> table = new TreeMap<>();
        String[] name = new String[names.length];

        for(int i = 0;i<names.length;i++){
            if (!table.containsKey(heights[i])){
                table.put(heights[i], names[i] );
            }
        }
        Arrays.sort(heights);
        int k = 0;
        for(int i = heights.length - 1; i >= 0 ; i--){
            name[k++] = table.get(heights[i]);
        }
        return name;
    }
}
