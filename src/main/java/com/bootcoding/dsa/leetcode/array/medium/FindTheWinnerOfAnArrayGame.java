package com.bootcoding.dsa.leetcode.array.medium;

import java.util.Arrays;

public class FindTheWinnerOfAnArrayGame {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4,6,7};

    }
    public static int getWinner(int[] arr, int k) {
        int n =arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        if(k>=arr.length){
            return max;
        }
        int element = arr[0];
        int streak = 0;
        for(int i = 1; i< n; i++){
            if(arr[i] >= element){
                element = arr[i];
                streak= 1;
            }else streak++;

            if(streak==k || element == max)return element;
        }
        return element;
    }
}
