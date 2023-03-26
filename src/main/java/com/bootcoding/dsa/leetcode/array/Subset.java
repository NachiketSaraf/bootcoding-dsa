package com.bootcoding.dsa.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
       int[] a = {1,2,3};
       createAllSubArray(a);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int start =0 ; start<nums.length; start++){
            for (int end = start; end<nums.length; end++){

            }

        }
    }
    private static void createAllSubArray(int[] arr) {
        // For creating the sub array
        for (int start =0 ; start<arr.length; start++){
            for (int end = start; end<arr.length; end++){
                printEverySubArray(arr,start,end); // To print every sub array
            }
        }

    }
    public static void printEverySubArray(int[] arr, int s, int e){

        // For printing every sub array
        System.out.print("{");
        for (int i = s; i<=e ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");

    }
}
