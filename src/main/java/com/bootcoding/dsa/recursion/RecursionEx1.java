package com.bootcoding.dsa.recursion;

public class RecursionEx1 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
    }
    public static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);

    }
}
