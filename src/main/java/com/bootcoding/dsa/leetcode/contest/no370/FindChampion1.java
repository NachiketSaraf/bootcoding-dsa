package com.bootcoding.dsa.leetcode.contest.no370;

public class FindChampion1 {
    public static void main(String[] args) {

        int[][] grid ={
                {0,1},
                {0,0}
        };
        System.out.println(findChampion(grid));
    }
    public static int findChampion(int[][] grid) {
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            boolean isChampion = true;
            for (int j = 0; j < n; j++) {
                if (i != j && grid[i][j] == 1) {
                    // Team i is weaker than team j, so it's not the champion
                    isChampion = false;
                    break;
                }
            }
            if (isChampion) {
                return i;
            }
        }

        // If no champion is found, you can return -1 or handle it according to your requirements
        return -1;
    }
}
