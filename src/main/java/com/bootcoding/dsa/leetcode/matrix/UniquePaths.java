package com.bootcoding.dsa.leetcode.matrix;

import java.util.ArrayList;
import java.util.List;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
    public static int uniquePaths(int m, int n) {

        return uniquePathsHelper(m, n, 0, 0);
    }

    private static int uniquePathsHelper(int m, int n, int i, int j) {
        if (i>=n || j>=m){
            return 0;
        }
        if(i==n-1 && j == m-1){
            return 1;
        }
        else return uniquePathsHelper(m,n,i+1,j) + uniquePathsHelper(m,n,i,j+1);
    }

}

