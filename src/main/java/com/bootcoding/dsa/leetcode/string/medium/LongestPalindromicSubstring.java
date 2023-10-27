package com.bootcoding.dsa.leetcode.string.medium;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        longestPalindrome(s);
    }
    public static String longestPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder("^#");
        for (char c : s.toCharArray()) {
            stringBuilder.append(c).append("#");
        }
        stringBuilder.append("$");
        String T = stringBuilder.toString();

        int n = T.length();
        int[] P = new int[n];
        int C = 0, R = 0;

        for (int i = 1; i < n-1; i++) {
            P[i] = (R > i) ? Math.min(R - i, P[2*C - i]) : 0;
            while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i]))
                P[i]++;

            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }
        }

        int max_len = 0, center_index = 0;
        for (int i = 0; i < n; i++) {
            if (P[i] > max_len) {
                max_len = P[i];
                center_index = i;
            }
        }
        return s.substring((center_index - max_len) / 2, (center_index + max_len) / 2);

    }
}
