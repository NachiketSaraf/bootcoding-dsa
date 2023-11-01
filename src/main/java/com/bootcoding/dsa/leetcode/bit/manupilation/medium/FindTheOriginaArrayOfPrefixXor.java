package com.bootcoding.dsa.leetcode.bit.manupilation.medium;

public class FindTheOriginaArrayOfPrefixXor {
    public static void main(String[] args) {
       int[] pref = {5,2,0,3,1};
    }
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        arr[0] = pref[0];
        for(int i = 1; i < pref.length; i++) {
            arr[i] = pref[i] ^ pref[i-1];
        }
        return arr;
    }
}
