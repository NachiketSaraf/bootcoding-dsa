package com.bootcoding.dsa.leetcode.array;

import java.util.*;
public class AssignCookies {
    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3,4,5,6,7,8,9},new int[]{1,1}));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int cookieIndex = 0;
        while (cookieIndex < s.length && contentChildren < g.length) {
            if (s[cookieIndex] >= g[contentChildren]) {
                contentChildren++;
            }
            cookieIndex++;
        }
        return contentChildren;
    }
}
