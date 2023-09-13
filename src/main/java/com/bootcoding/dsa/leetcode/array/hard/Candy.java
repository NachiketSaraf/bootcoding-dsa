package com.bootcoding.dsa.leetcode.array.hard;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Candy {
    public static int candy(int[] ratings) {
        int[] leftTraverse = new int[ratings.length];
        Arrays.fill(leftTraverse,1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i-1]){
                leftTraverse[i] = leftTraverse[i-1] + 1;
            }
        }

        int rightTraverse = 1;

        for (int i = (ratings.length-2); i >=0 ; i--) {
            if (ratings[i]>ratings[i+1]){
                rightTraverse++;
                leftTraverse[i] = Math.max(leftTraverse[i],rightTraverse );
            }
            else rightTraverse=1;
        }

        int sum = 0;
        for (int i = 0; i < leftTraverse.length; i++) {
            sum += leftTraverse[i];
        }
        return sum;
    }
}
