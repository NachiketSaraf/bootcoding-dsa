package com.bootcoding.dsa.leetcode.array.medium;

public class FindTheWinnerOfAnArrayGame {
    public int getWinner(int[] arr, int k) {
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
