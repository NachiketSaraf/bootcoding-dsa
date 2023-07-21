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
        int[] hash = new int[26];

        for (int i = 0; i < s.length() ; i++) {
            hash[s.charAt(i)-'a'] +=1;
        }
        for (int j = 0; j < s.length(); j++) {
            if (hash[s.charAt(j)-'a'] == 1){
                return j;
            }
        }

        return -1;

//        Map<Character,Integer> map =new LinkedHashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char key = s.charAt(i);
//            if (map.containsKey(key)){
//                Integer integer = map.get(key);
//                map.put(key,integer+1);
//            }
//            else {
//                map.put(key,1);
//            }
//        }
//        for (Character n: map.keySet()) {
//            if (map.get(n) == 1 ){
//                for (int i = 0; i < s.length(); i++) {
//                    if (s.charAt(i) == n){
//                        return i;
//                    }
//                }
//            }
//        }

    }
}
