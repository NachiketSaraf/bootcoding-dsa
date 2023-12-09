package com.bootcoding.dsa.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class BubbleSort {
    public static void main(String[] args) {
        int[] s = sortBubble(new int[]{50,17,19,14,5});
        Arrays.stream(s).forEach(System.out::println);
//        for (int b : s) System.out.println(b);
    }
    private static int[] sortBubble(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if (num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        return num;
    }
}
