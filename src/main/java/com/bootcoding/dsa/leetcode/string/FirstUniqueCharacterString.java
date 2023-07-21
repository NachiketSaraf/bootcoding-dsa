package com.bootcoding.dsa.leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FirstUniqueCharacterString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map =new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (map.containsKey(key)){
                Integer integer = map.get(key);
                map.put(key,integer+1);
            }
            else {
                map.put(key,1);
            }
        }
        for (Character n: map.keySet()) {
            if (map.get(n) == 1 ){
                return n;
            }
        }
        return -1;
    }
}
