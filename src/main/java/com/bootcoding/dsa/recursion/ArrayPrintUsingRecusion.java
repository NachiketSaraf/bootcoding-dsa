package com.bootcoding.dsa.recursion;

public class ArrayPrintUsingRecusion {

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5};
        getArray(array,0);
    }
    private static void getArray(int[] array,int k) {
        if (k == array.length) return;
        System.out.println(array[k]);
        getArray(array,k+1);
    }
}
