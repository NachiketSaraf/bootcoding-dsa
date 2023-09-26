package com.bootcoding.dsa.array;

public class StrSum {
    public static String solution(String a, String b) {
        // Reverse both input strings
        StringBuilder reversedA = new StringBuilder(a).reverse();
        StringBuilder reversedB = new StringBuilder(b).reverse();

        // Initialize variables for the result and carry
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int maxLength = Math.max(reversedA.length(), reversedB.length());

        // Iterate through the strings, adding digits and carry
        for (int i = 0; i < maxLength; i++) {
            int digitA = (i < reversedA.length()) ? Character.getNumericValue(reversedA.charAt(i)) : 0;
            int digitB = (i < reversedB.length()) ? Character.getNumericValue(reversedB.charAt(i)) : 0;

            // Calculate the sum and carry
            int digitSum = digitA + digitB + carry;
            carry = digitSum / 10;
            digitSum %= 10;

            // Append the sum to the result
            result.append(digitSum);
        }

        // If there's a carry left, append it to the result
        if (carry > 0) {
            result.append(carry);
        }

        // Reverse the result and return it as a string
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("99", "99"));  // Output: "18181"
        System.out.println(solution("11", "9"));   // Output: "110"
    }


}
