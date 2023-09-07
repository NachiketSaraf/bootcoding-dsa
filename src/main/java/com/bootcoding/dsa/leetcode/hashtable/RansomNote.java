package com.bootcoding.dsa.leetcode.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> magHash = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            Character key = magazine.charAt(i);
            if (magHash.containsKey(key)){
                magHash.put(key,magHash.get(key)+1);
            }
            else magHash.put(key,1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Character key = ransomNote.charAt(i);
            if (!magHash.containsKey(key) || magHash.get(key)==0){
                return false;
            }
            magHash.put(key,magHash.get(key)-1);
        }

        return true;
    }
}
