package com.bootcoding.dsa.leetcode.bit.manupilation;
import java.lang.reflect.Array;
import java.util.Arrays;
public class SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] ans = sortByBits(arr);
        for (int i : ans){
            System.out.println(i);
        }
    }
    public static int[] sortByBits(int[] arr) {
        Integer[] boxedArr =  Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        Integer[] boxedArr = new Integer[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            boxedArr[i] = arr[i];
//        }



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

