package com.bootcoding.dsa.array;

import java.util.Arrays;

public class MergeToSortedArray {
    public static void main(String[] args) {
        int[] a ={1,3};
        int[] b = {2};
        System.out.println(mergeArray(a,b));

    }
    public static double mergeArray(int[] a, int[] b){
        int n = (a.length+ b.length);
        int[] c = new int[n];
        int j = 0;
       for (int i = 0 ; i<n;i++){
           if (i<= a.length-1){
               c[i]=a[i];
           }else {
               c[i]=b[j++];
           }
       }

        Arrays.sort(c);
       int m = c.length;
       int o = m/2;
       if (m%2==0){
           double p= c[o];
           double q = c[o-1];
           return ((p + q) / 2);
       }
       else{
//          double s = ;
           return c[o] ;
       }
    }
}
