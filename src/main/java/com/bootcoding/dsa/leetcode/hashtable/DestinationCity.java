package com.bootcoding.dsa.leetcode.hashtable;

import java.util.*;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> innerList = new ArrayList<>();

        innerList.add(0,"London , New York");
        innerList.add(1,"New York , Lima");
        innerList.add(2,"Lima , Sao Paulo");

        paths.add(innerList);
        System.out.println(destCity(paths));
    }
    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet();
        for (int i = 0; i < paths.size(); i++) set.add(paths.get(i).get(0));
        for (int i = 0; i < paths.size(); i++) {
            String candidate = paths.get(i).get(1);
            if (!set.contains(candidate)) return candidate;
        }
        return "";
    }
}
