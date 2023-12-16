package com.bootcoding.dsa.leetcode.hashtable;

public class DestinationCity {
    public static void main(String[] args) {
        String[][] paths = {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
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
