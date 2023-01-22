package com.bootcoding.dsa.codingtestseries;

public class MinElementOfArrayUsingRecursion {
    public static void main(String[] args) {
        int[] array = {1,2,5,6};
        int min = array[0];
        int val = minElement(array,min,0);
        System.out.println(val);

    }

    private static int minElement(int[] array, int min, int i) {
        if (i== array.length){
            return min;
        }
        if (array[i]<min){
            min=array[i];
        }
        return minElement(array, min, ++i);
    }
}
