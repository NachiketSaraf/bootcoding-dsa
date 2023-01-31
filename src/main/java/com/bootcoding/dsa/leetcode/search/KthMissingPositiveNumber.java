package com.bootcoding.dsa.leetcode.search;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        System.out.println(findKthPositive(arr, 1));
    }

    public static int findKthPositive(int[] arr, int k) {
        int misPos = 1;
        int i = 0;
        while (true) {
            if (misPos == arr[i]) {
                i++;

            } else {

                --k;
                if (k == 0) {
                    return misPos;
                }
            }

            misPos++;
            if (i == arr.length) {
                --i;
            }

        }

    }

}

