package com.bootcoding.dsa.leetcode.bit.manupilation.medium;

import java.util.Arrays;

public class FindTheOriginaArrayOfPrefixXor {
    public static void main(String[] args) {
       int[] pref = {13};

       int[] ans = findArray(pref);

       Arrays.stream(ans).forEach(System.out::println);
    }
    public static int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];

        arr[0] = pref[0];

        for(int i = 1; i < pref.length; i++)
            arr[i] = pref[i] ^ pref[i - 1];

        return arr;
    }
}
