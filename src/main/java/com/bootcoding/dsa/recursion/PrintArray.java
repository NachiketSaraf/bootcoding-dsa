package com.bootcoding.dsa.recursion;

public class PrintArray {
    public static void main(String[] args) {
        print(new int[]{13,43,55,66,77},0);
    }
   public static void print(int[] arr,int i){
        if (i== arr.length){
            return;
        }
       System.out.println(arr[i]);
        print(arr,++i);
   }
}
