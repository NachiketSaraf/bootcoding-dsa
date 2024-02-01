package com.bootcoding.dsa.leetcode.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SumOfSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {
        int length = arr.length;
        int[] leftArr = new int[length];
        int[] rightArr = new int[length];

        Arrays.fill(leftArr, -1);
        long[] rightArrArr = new long[0];
        Arrays.fill(rightArrArr, length);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < length; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                leftArr[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        for (int i = length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                rightArr[i] = stack.peek();
            }
            stack.push(i);
        }

        int mod = (int) 1e9 + 7;
        long answer = 0;

        for (int i = 0; i < length; ++i) {
            answer += (long) (i - leftArr[i]) * (rightArr[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }

        return (int) answer;
    }
}
