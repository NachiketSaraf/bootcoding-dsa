package com.bootcoding.dsa.leetcode.bit.manupilation;
import java.util.Arrays;
public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] ans = sortByBits(arr);
        for (int i : ans){
            System.out.println(i);
        }
    }
    /***************************************************************** JAVA *****************************************************************/
//Approach-1 (Using self written countBits function inside lambda)
//T.C : O(n*logn * log(num))
//The countOneBits loop iterates for the number of bits in the input number, which is log₂(n)
//sort takes nlogn

        public static int countOneBits(int num) {
            int count = 0;
            while (num != 0) {
                count += num & 1;
                num >>= 1;
            }
            return count;
        }

        public static int[] sortByBitsLambda(int[] arr) {
            Integer[] boxedArr = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                boxedArr[i] = arr[i];
            }

            Arrays.sort(boxedArr, (a, b) -> {
                int countA = countOneBits(a);
                int countB = countOneBits(b);

                if (countA == countB) {
                    return a.compareTo(b);
                }

                return Integer.compare(countA, countB);
            });

            for (int i = 0; i < arr.length; i++) {
                arr[i] = boxedArr[i];
            }

            return arr;
        }



//Approach-2 (using inbuilt function)
//T.C : Integer.bitCount calculates the number of set bits (1 bits) in an integer in constant time, not depending on the size of the integer.
//So, overall T.C : O(n log n) by sorting



        public static int[] sortByBits(int[] arr) {
            Integer[] boxedArr = new Integer[arr.length];
            for (int i = 0; i < arr.length; i++) {
                boxedArr[i] = arr[i];
            }

            Arrays.sort(boxedArr, (a, b) -> {
                int countA = Integer.bitCount(a);
                int countB = Integer.bitCount(b);

                if (countA == countB) {
                    return a.compareTo(b);
                }

                return Integer.compare(countA, countB);
            });

            for (int i = 0; i < arr.length; i++) {
                arr[i] = boxedArr[i];
            }

            return arr;
        }

}

