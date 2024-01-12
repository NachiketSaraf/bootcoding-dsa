package com.bootcoding.dsa.leetcode.string;

import java.util.HashSet;
import java.util.Set;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {

    }
    public static boolean halvesAreAlike(String s) {
        int aCount = 0;
        int bCount = 0;

        Set<Character> vowels = new HashSet<>();
        String vowelsString = "aeiouAEIOU";
        for(char c: vowelsString.toCharArray()) vowels.add(c);

        int i=0;
        int j = s.length()/2;
        while (i < s.length()/2 && j < s.length() ) {
            if (vowels.contains(s.charAt(i))) aCount++;
            if (vowels.contains(s.charAt(j))) bCount++;
            i++;
            j++;
        }

        return aCount == bCount;
    }
}
