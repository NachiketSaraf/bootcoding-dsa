package com.bootcoding.dsa.leetcode.bit.manupilation;
import java.util.Arrays;
public class SortIntegersByTheNumberOf1Bits {
    /***************************************************************** JAVA *****************************************************************/
//Approach-1 (Using self written countBits function inside lambda)
//T.C : O(n*logn * log(num))
//The countOneBits loop iterates for the number of bits in the input number, which is log₂(n)
//sort takes nlogn
    class Solution {
        public int countOneBits(int num) {
            int count = 0;
            while (num != 0) {
                count += num & 1;
                num >>= 1;
            }
            return count;
        }

        public int[] sortByBits(int[] arr) {
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
    }


//Approach-2 (using inbuilt function)
//T.C : Integer.bitCount calculates the number of set bits (1 bits) in an integer in constant time, not depending on the size of the integer.
//So, overall T.C : O(nlogn) by sorting


    class Solution1 {
        public int[] sortByBits(int[] arr) {
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
}

