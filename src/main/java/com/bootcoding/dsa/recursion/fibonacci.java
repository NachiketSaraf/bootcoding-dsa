package com.bootcoding.dsa.recursion;

public class fibonacci {
    public static void main(String[] args) {
    int a = 0, b=1 ;
    int n =10;
        System.out.println(a);
        System.out.println(b);
    printFibonacci(a,b,n-2);
    }

    private static void printFibonacci(int a, int b, int n) {
        if(n==0){
            return;
        }
        int c = a  + b;
        System.out.println(c);
        printFibonacci(b,c,n-1);
    }

}
