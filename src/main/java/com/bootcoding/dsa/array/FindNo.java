package com.bootcoding.dsa.array;

public class FindNo {


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = 3;
        int c=1;
        for (int i =0;i<a.length;i++){
            if(n==a[i]){
                System.out.println("found" + a[i]);
                break;
            }
            else if (i==a.length-1){
                System.out.println("not found");
            }
            c++;
        }
        System.out.println(c);
    }
}
