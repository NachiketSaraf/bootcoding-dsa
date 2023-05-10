package com.bootcoding.dsa.recursion;

public class ArrayPrintUsingRecusion {

    public static void main(String[] args) {
        int[] array= {1,2,3,4,5};
        getArray(array,0);
    }
    private static void getArray(int[] array,int i) {
        if (i == array.length) return;
        System.out.println(array[i]);
        getArray(array,i+1);
    }

}
