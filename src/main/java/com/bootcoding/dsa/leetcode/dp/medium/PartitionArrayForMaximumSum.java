package com.bootcoding.dsa.leetcode.dp.medium;

import java.util.*;
public class PartitionArrayForMaximumSum {
    public static void main(String[] args) {
        int[] arr = {1,15,7,9,2,5,10};
    }
    private static int maxSum(int[] arr, int k, int[] dp, int start) {
        int N = arr.length;

        if (start >= N) {
            return 0;
        }

        // Return the already calculated answer.
        if (dp[start] != -1) {
            return dp[start];
        }

        int currMax = 0, ans = 0;
        int end = Math.min(N, start + k);
        for (int i = start; i < end; i++) {
            currMax = Math.max(currMax, arr[i]);
            // Store the maximum of all options for the current subarray.
            ans = Math.max(ans, currMax * (i - start + 1) + maxSum(arr, k, dp, i + 1));
        }

        // Store the answer to be reused.
        return dp[start] = ans;
    }

    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);

        return maxSum(arr, k, dp, 0);
    }

}
