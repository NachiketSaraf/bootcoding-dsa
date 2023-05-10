package com.bootcoding.dsa.recursion;

public class ArrayPrintUsingRecusion {

    public static void main(String[] args) {
        getArray(new int[] {1,2,3,4,5},0);
    }
    private static void getArray(int[] arr,int k) {
        if (k == arr.length) return;
        System.out.println(arr[k]);
        getArray(arr,k+1);
    }
}
