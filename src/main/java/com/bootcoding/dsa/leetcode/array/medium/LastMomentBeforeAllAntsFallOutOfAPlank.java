package com.bootcoding.dsa.leetcode.array.medium;

public class LastMomentBeforeAllAntsFallOutOfAPlank {
    public static void main(String[] args) {
       int n = 4;
       int[] left = {4,3};
       int[] right = {0,1};
        System.out.println(getLastMoment(n,left,right));
    }
    public static int getLastMoment(int n, int[] left, int[] right) {
        int result = 0;
        for (int num : left) result = Math.max(result,num);
        for (int num : right) result = Math.max(result,n-num);
        return result;
    }
}
