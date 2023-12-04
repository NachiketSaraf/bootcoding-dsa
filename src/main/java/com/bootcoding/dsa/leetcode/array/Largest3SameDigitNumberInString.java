package com.bootcoding.dsa.leetcode.array;

public class Largest3SameDigitNumberInString {
    public static void main(String[] args) {
        String num = "6777133339";

    }
    public static String largestGoodInteger(String num) {
        char maxDigit = '\0';
        for (int index = 0; index <= num.length() - 3; ++index) {
            if (num.charAt(index) == num.charAt(index + 1) && num.charAt(index) == num.charAt(index + 2)) {
                maxDigit = (char) Math.max(maxDigit, num.charAt(index));
            }
        }
        return maxDigit == '\0' ? "" : new String(new char[]{maxDigit, maxDigit, maxDigit});
    }

}
