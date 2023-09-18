package com.bootcoding.dsa.hackerrank.one.month.preparation.kit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
    public static void miniMaxSum(List<Integer> arr) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i)<min) min = arr.get(i);
            if (arr.get(i)>max) max = arr.get(i);
        }
        System.out.println((sum-max)+" "+(sum-min));

//        int min = 0;
//        int max = 0;
//        Collections.sort(arr);
//
//        for (int i = 0; i < arr.size(); i++) {
//            if (i<arr.size()-1) min += arr.get(i);
//            if (i>0) max += arr.get(i);
//        }
//        System.out.println(min +" "+ max);

    }
}
