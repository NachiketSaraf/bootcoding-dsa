package com.bootcoding.dsa.array;

import javax.swing.plaf.PanelUI;
import java.awt.desktop.OpenURIEvent;

public class test {
    public static void main(String[] args) {
        System.out.println(solution2("11", "9"));
//        int[] diffs = {-1000, -500};
//
//        int[] ans = solution(diffs);
//        for (int n :
//                ans) {
//            System.out.println(n);
//        }
    }

//    public static int[] countLamps(int[][] lamps, int[] points) {
//        int[] result = new int[points.length];
//
//        // Sort the lamps by their left end
//        Arrays.sort(lamps, (a, b) -> a[0] - b[0]);
//
//        for (int i = 0; i < points.length; i++) {
//            int point = points[i];
//            int count = 0;
//
//            for (int[] lamp : lamps) {
//                if (lamp[0] <= point && point <= lamp[1]) {
//                    count++;
//                } else if (lamp[0] > point) {
//                    // Since lamps are sorted by their left end,
//                    // if the current lamp's left end is greater than the point,
//                    // break the loop because no other lamps will cover this point.
//                    break;
//                }
//            }
//
//            result[i] = count;
//        }
//
//        return result;
//    }


    public static String strSum(String a, String b){
        StringBuilder result = new StringBuilder();
        int maxLength = Math.max(a.length(), b.length());
        for (int i = maxLength-1; i < maxLength; i++) {

        }
return "";
    }
    public static String solution2(String a, String b) {
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


    public static String solution1(String a, String b) {
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



    public static int[] cal(int[] diffs) {
        int[] arr = {1500, 1500};
        int initial = 1500;


        for (int i = 0; i < diffs.length; i++) {
            if ((initial + diffs[i]) > arr[0]) {
                initial += diffs[i];
                arr[0] = initial;
            } else if ((initial + diffs[i]) < arr[1]) {
                initial += diffs[i];
                arr[1] = initial;
            }
        }

        return arr;

    }

    public static int[] solution(int[] diffs) {

        int currentRating = 1500; // Initial rating

        int highestRating = Integer.MIN_VALUE; // Initialize to the minimum possible val

        for (int diff : diffs) {

            currentRating += diff; // Update current rating

            highestRating = Math.max(highestRating, currentRating); // Update highest ra

        }

        int[] result = {highestRating, currentRating};

        return result;

    }

    public static String solution(String a, String b) {
        // Initialize pointers and results StringBuilder
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0) {
            // Get the digits at the current positions
            int digitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int digitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;

            // Calculate the sum and append it to the result
            int total = digitA + digitB;
            result.append(total);

            // Move the pointers to the previous positions
            i--;
            j--;
        }

        return result.reverse().toString();
    }


}

