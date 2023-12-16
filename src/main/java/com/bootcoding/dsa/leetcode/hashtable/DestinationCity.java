package com.bootcoding.dsa.leetcode.hashtable;

import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
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