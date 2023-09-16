package com.bootcoding.dsa.hackerrank.one.month.preparation.kit;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        float pos = 0;
        float zeros = 0;
        float neg = 0;

        for (Integer n : arr) {
            if (n>0) pos++;
            else if (n==0) zeros++;
            else if (n<0) neg++;
        }
        System.out.printf("%.6f \n",pos/arr.size());
        System.out.printf("%.6f \n",zeros/arr.size());
        System.out.printf("%.6f \n",neg/arr.size());





    }
}
