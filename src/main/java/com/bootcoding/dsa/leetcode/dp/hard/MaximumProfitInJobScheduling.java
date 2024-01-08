package com.bootcoding.dsa.leetcode.dp.hard;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumProfitInJobScheduling {
    public static void main(String[] args) {
        int[] startTime = {1,2,3,3};
        int[] endTime = {3, 4, 5, 6};
        int[] profit = {50,10,40,70};
        jobScheduling(startTime,endTime,profit);
    }
    private static int[] memo;
    private static int n;

    private static int getNextIndex(int[][] array, int l, int currentJobEnd) {
        int r = n - 1;
        int result = n + 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (array[mid][0] >= currentJobEnd) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return result;
    }

    private static int solve(int[][] array, int i) {
        if (i >= n)
            return 0;

        if (memo[i] != -1)
            return memo[i];

        int next = getNextIndex(array, i + 1, array[i][1]);

        int taken = array[i][2] + solve(array, next);
        int notTaken = solve(array, i + 1);

        return memo[i] = Math.max(taken, notTaken);
    }

    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        n = startTime.length;

        memo = new int[n];
        Arrays.fill(memo, -1);

        int[][] array = new int[n][3]; // {s, e, p}

        for (int i = 0; i < n; i++) {
            array[i][0] = startTime[i];
            array[i][1] = endTime[i];
            array[i][2] = profit[i];
        }

        Arrays.sort(array, Comparator.comparingInt(vec -> vec[0]));

        return solve(array, 0);
    }
}
