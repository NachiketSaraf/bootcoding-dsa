package com.bootcoding.dsa.recursion;

public class AscendingOrder {
    public static void main(String[] args) {
        print(5);
    }
    public static void print(int n){
        if (n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}

//wap to sum of no frommm 1 to n
//wap to print even no in decending order
//wap to print odd no in ascending order