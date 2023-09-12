package com.bootcoding.dsa.leetcode.array.medium;

public class DetermineIfCellReachableGivenTime {
    public static void main(String[] args) {

    }
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int xdif = Math.abs(sx-fx);
        int ydif = Math.abs(sy-fy);

        if (xdif == 0 && ydif ==0 && t==1) return false;

        return Math.min(xdif,ydif) + Math.abs(xdif- ydif) <= t;
    }
}
